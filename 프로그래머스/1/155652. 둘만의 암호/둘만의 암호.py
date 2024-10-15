def solution(s, skip, index):
    answer = ''
    result = []
    
        
    for sLetter in s:
        
        i = 1
        wIndex = index
        letter = int(ord(sLetter))
        
        while i < (wIndex + 1):
            
            letter += 1
            if(letter > 122):
                letter -= 26
            if chr(letter) in skip:
                wIndex += 1
            i += 1
        
        
        result.append(chr(letter))
    for char in result:
        answer += char
    return answer
