import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(String str : keymap) {
            for(int i = 1; i <= str.length(); i++) {
                char c = str.charAt(i - 1);
                int position = hm.getOrDefault(c, i);

                if(position > i) hm.put(c, i);
                else hm.put(c, position);
            }
        }

        int[] answer = new int[targets.length];

        for(int i = 0; i < targets.length; i++) {
            String str = targets[i];
            int cnt = 0;
            for(char c : str.toCharArray()) {
                int n = hm.getOrDefault(c, 0);

                if(n == 0) {
                    cnt = -1;
                    break;
                }
                else cnt += n;
            }
            answer[i] = cnt;
        }

        return answer;
    }
}