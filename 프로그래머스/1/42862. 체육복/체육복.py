def solution(n, lost, reserve):
    lost.sort()
    reserve.sort()
    num = set(lost) & set(reserve)
    if(len(num) > 0):
        for a in num:
            lost.remove(a)
            reserve.remove(a)
    answer = n - len(lost)
    for lNum in lost:
        for rNum in reserve:
            if(rNum - 1 == lNum):
                answer += 1
                reserve.pop(0)
            if(rNum + 1 == lNum):
                answer += 1
                reserve.pop(0)
    return answer
