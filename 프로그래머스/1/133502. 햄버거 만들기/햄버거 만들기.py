def solution(ingredient):
    answer = 0
    tmp = []
    for i in range(len(ingredient)):
        tmp.append(ingredient[i])
        if ingredient[i] == 1 and len(tmp) >= 4:
            leng = len(tmp)
            if tmp[leng-4:leng] == [1, 2, 3, 1]:
                del tmp[leng-4:leng]
                answer += 1
    return answer