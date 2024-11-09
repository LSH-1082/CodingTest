class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        String answer = "";
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == ' ') answer += " ";
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){
                if(sb.charAt(i) + n > 'z'){
                    answer += (char) (sb.charAt(i) + n - 26);
                }
                else answer += (char) (sb.charAt(i) + n);
            }
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){
                if(sb.charAt(i) + n > 'Z'){
                    answer += (char)(sb.charAt(i) + n - 26);
                }
                else answer += (char) (sb.charAt(i) + n);
            }
        }
        return answer;
    }
}