class Solution {
    public int solution(String dartResult) {
        String[] str = slicePointString(dartResult);
        int answer = calcTotalScore(str);
        return answer;
    }

    public int calcTotalScore(String[] pointString) {
        int[] score = new int[3];

        for(int i = 0; i < score.length; i++) {
            String s = pointString[i];

            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(Character.isDigit(s.charAt(j))) {
                    if(score[i] != 0) 
                        score[i] = Integer.parseInt(String.valueOf(score[i]) + s.charAt(j));
                    else 
                        score[i] = s.charAt(j) - '0';
                }
                else {
                    switch (c) {
                        case 'D':
                            score[i] = (int)Math.pow(score[i], 2);
                            break;
                        case 'T':
                            score[i] = (int)Math.pow(score[i], 3);
                            break;
                        case '*':
                            if(i > 0) {
                                score[i - 1] *= 2;
                                score[i] *= 2;
                            }
                            else score[i] *= 2;
                            break;
                        case '#':
                            score[i] *= -1;
                            break;
                    }
                }
            }
        }
        return score[0] + score[1] + score[2];
    }

    public String[] slicePointString(String pointString) {
        String[] result = new String[3];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++) {
            while(Character.isDigit(pointString.charAt(0))) {
                sb.append(pointString.charAt(0));
                pointString = pointString.substring(1);
            }

            for(int j = 0; j < pointString.length(); j++) {
                char c = pointString.charAt(j);

                if(Character.isDigit(c)) {
                    pointString = pointString.substring(j);
                    break;
                }
                else sb.append(c);
            }
            result[i] = sb.toString();
            sb.setLength(0);
        }

        return result;
    }
}