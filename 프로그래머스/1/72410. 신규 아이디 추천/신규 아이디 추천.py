def solution(new_id):
    step_1 = new_id.lower()
    step_2 = step_1
    for char in step_1:
        if not("a" <= char <= "z" or char.isdecimal() or char in ["-", "_", "."]):
            step_2 = step_2.replace(char, "")
    cnt = 0
    step_3 = ""
    for char in step_2:
        step_3 += char
        if char == ".":
            cnt += 1
        else:
            if cnt >= 2:
                step_3 = step_3.replace("." * cnt, ".")
            cnt = 0
    if cnt >= 2:
        step_3 = step_3.replace("." * cnt, ".")

    step_4 = step_3
    if step_4 != "" and step_4[0] == ".":
        step_4 = step_4[1:]
    if step_4 != "" and step_4[-1] == ".":
        step_4 = step_4[:-1]
    step_5 = step_4
    if step_5 == "":
        step_5 = "a"
    step_6 = step_5
    if len(step_6) >= 16:
        step_6 = step_6[0:15]
        if step_6[0] == ".":
            step_6 = step_6[1:]
        if step_6[-1] == ".":
            step_6 = step_6[:-1]
        
    step_7 = step_6
    while(len(step_7) < 3):
        step_7 = step_7 + step_7[-1]
        
    answer = step_7
    return answer