class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
         String[] answer = new String[n];
        StringBuilder tmp = new StringBuilder();
        String result = "";
        for(int i = 0; i < n; i++){
            result = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(result.length() < n){
                tmp.append(" ".repeat(n - result.length()));
            }
            for(int j = 0; j < result.length(); j++){
                tmp.append(result.charAt(j) == '0' ? " " : "#");
            }
            answer[i] = tmp.toString();
            tmp = new StringBuilder();
        }
        return answer;
    }
}