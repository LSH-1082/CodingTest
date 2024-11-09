class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder answer = new StringBuilder();
        int cnt = 0;
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ' ') {
                answer.append(sb.charAt(i));
                cnt = 0;
            }
            else if(cnt % 2 == 0) {
                answer.append(String.valueOf(sb.charAt(i)).toUpperCase());
                cnt++;

            }
            else {
                answer.append(String.valueOf(sb.charAt(i)).toLowerCase());
                cnt++;
            }

        }
        return answer.toString();
    }
}