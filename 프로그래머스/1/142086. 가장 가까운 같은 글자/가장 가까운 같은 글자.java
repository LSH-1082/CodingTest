import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Boolean> map = new HashMap<>();
        map.put(s.charAt(0), true);
        answer[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                for(int j = i - 1; j >= 0; j--) {
                    if(s.charAt(j) == s.charAt(i)) {
                        answer[i] = i - j;
                        break;
                    }
                }
            }
            else {
                answer[i] = -1;
                map.put(s.charAt(i), true);
            }
        }
        return answer;
    }
}