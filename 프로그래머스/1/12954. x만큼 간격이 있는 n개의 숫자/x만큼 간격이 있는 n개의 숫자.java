import java.util.ArrayList;

class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> list = new ArrayList<>();
        for(int i = 1; i < n + 1; i++) {
            list.add((long) x * i);
        }
        long[] answer = new long[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}