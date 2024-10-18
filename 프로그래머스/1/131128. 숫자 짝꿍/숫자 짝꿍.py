def solution(X, Y):
    setList = set(X) & set(Y)
    if not setList:
        return "-1"
    if len(setList) == 1 and '0'in setList:
        return "0"
    numList = list(setList)
    numList.sort()

    dic = {}
    answerDic ={}

    for num in numList:
        dic[num] = 0
        answerDic[num] = 0
    
    for num in X:
        if num in dic:
            dic[num] += 1
    
    for num in Y:
        if num in dic:
            if dic[num] - 1 >= 0:
                dic[num] -= 1
                answerDic[num] += 1

    answer = ""
    for num in answerDic:
        result = num * answerDic[num]
        answer = result + answer
        answerDic[num] -= 1

    return answer