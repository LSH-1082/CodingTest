def solution(board, moves):
    bucket = []
    tmp = []
    lst = []
    cnt = 0
    for i in range(len(board)):
        for j in range(len(board)):
            if board[j][i] != 0:
                tmp.append(board[j][i])
        lst.append(tmp)
        tmp = []    
    
    for num in moves:
        if len(lst[num - 1]) > 0:
            bucket.append(lst[num - 1].pop(0))
            if len(bucket) >= 2 and bucket[-2] == bucket[-1]:
                del bucket[-2:]
                cnt += 2

    return cnt