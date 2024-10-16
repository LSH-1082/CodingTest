def solution(participant, completion):
    dic = {}
    for part in participant:
        if part in dic:
            dic[part] += 1
        else:
            dic[part] = 1
    
    for com in completion:
        dic[com] -= 1
    
    for str in dic.keys():
        if dic[str] == 1:
            return str