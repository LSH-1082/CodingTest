def solution(survey, choices):
    first = {"R": 0,
             "T": 0}
    second = {"C": 0,
              "F": 0}
    third = {"J": 0,
             "M": 0}
    fourth = {"A": 0,
              "N": 0}
    for i in range(len(survey)):
        if survey[i] == "TR" or survey[i] == "RT":
            first[survey[i][1] if choices[i] - 4 > 0 else survey[i][0]] += abs(choices[i] - 4)
        if survey[i] == "CF" or survey[i] == "FC":
            second[survey[i][1] if choices[i] - 4 > 0 else survey[i][0]] += abs(choices[i] - 4)
        if survey[i] == "JM" or survey[i] == "MJ":
            third[survey[i][1] if choices[i] - 4 > 0 else survey[i][0]] += abs(choices[i] - 4)
        if survey[i] == "AN" or survey[i] == "NA":
            fourth[survey[i][1] if choices[i] - 4 > 0 else survey[i][0]] += abs(choices[i] - 4)
        
        answer = ""
        
        answer += "R" if first["R"] >= first["T"] else "T"
        answer += "C" if second["C"] >= second["F"] else "F"
        answer += "J" if third["J"] >= third["M"] else "M"
        answer += "A" if fourth["A"] >= fourth["N"] else "N"


    return answer
