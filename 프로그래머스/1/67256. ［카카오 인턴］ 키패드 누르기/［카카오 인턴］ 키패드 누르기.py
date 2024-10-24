def solution(numbers, hand):
    keypad = [[1, 2, 3],
              [4, 5, 6],
              [7, 8, 9],
              ["*", 0, "#"]]
    answer = ''
    left_thumb = "*"
    right_thumb = "#"
    for num in numbers:
        if num in [1, 4, 7]:
            answer += "L"
            left_thumb = num
        if num in [3, 6, 9]:
            answer += "R"
            right_thumb = num
        if num in [2, 5, 8, 0]:
            for i in range(len(keypad)):
                if left_thumb in keypad[i]:
                    l_loc = i
                if right_thumb in keypad[i]:
                    r_loc = i
                if num in keypad[i]:
                    n_loc = i
            l_dis = abs(l_loc - n_loc) if left_thumb in [2, 5, 8, 0] else abs(l_loc - n_loc) + 1
            r_dis = abs(r_loc - n_loc) if right_thumb in [2, 5, 8, 0] else abs(r_loc - n_loc) + 1
            if l_dis == r_dis:
                if hand == "right":
                    answer += "R"
                    right_thumb = num
                else:
                    answer += "L"
                    left_thumb = num
            elif l_dis > r_dis:
                answer += "R"
                right_thumb = num
            elif l_dis < r_dis:
                answer += "L"
                left_thumb = num


    return answer