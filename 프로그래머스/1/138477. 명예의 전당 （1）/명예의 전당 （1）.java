import java.util.ArrayList;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            list.sort(Integer::compareTo);
            if(list.size() < k) answer[i] =list.get(0);
            else answer[i] = list.get(list.size() - k);
        }
        return answer;
    }
}