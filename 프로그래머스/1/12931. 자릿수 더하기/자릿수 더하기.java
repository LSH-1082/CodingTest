public class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        int number = 0;
        for(int i = 0; i < num.length(); i++){
            number += Integer.parseInt(num.charAt(i) + "");
        }
        return number;
    }
}