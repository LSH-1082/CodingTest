import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            list.add(0, ch - '0');
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}