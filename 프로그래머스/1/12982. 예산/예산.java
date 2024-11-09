import java.util.ArrayList;

class Solution {
    public int solution(int[] d, int budget) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;
        int total = 0;
        for(int num : d){
            list.add(num);
        }
        list.sort(Integer::compareTo);
        for(int num : list){
            if(total + num <= budget) {
                total += num;
                answer++;
            }
            else break;
        }
        return answer;
    }
}