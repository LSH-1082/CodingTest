def solution(wallpaper):
    highest_x = None
    lowest_x = None

    highest_y = None
    lowest_y = None
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[i])):
            if wallpaper[i][j] == "#":
                if highest_x == None and lowest_x == None and highest_y == None and lowest_y == None:
                    highest_x = i
                    lowest_x = i
                    highest_y = j
                    lowest_y = j
                if highest_x < i:
                    highest_x = i
                if lowest_x > i:
                    lowest_x = i
                if highest_y < j:
                    highest_y = j
                if lowest_y > j:
                    lowest_y = j
    answer = [lowest_x, lowest_y, highest_x+1, highest_y+1]
    return answer