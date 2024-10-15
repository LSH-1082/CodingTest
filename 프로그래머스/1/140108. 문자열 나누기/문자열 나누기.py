def solution(s):
    answer = 0
    
    i = 1
    fCnt = 0
    eCnt = 0
    cTmp = ''
    temp = []
    result = []
    first = ''
    for letter in s:
        temp.append(letter) 
        if(len(temp) == 1):
            first = temp[0]
        
        if(temp[len(temp) - 1] == first):
            fCnt += 1
        else:
            eCnt += 1
        
        if(eCnt == fCnt):
            answer += 1
            fCnt = 0
            eCnt = 0
            for char in temp:
                cTmp += char
            result.append(cTmp)
            temp = []

        if(i == len(s)):
            if(len(cTmp) != len(s)):
                answer += 1

        i += 1
    
    
    
    return answer