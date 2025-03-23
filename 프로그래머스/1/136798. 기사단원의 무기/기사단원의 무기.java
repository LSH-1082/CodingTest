import java.util.ArrayList;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= number; i++){
            for(int j = 1; j * j <= i; j++){
                if(i % j == 0) {
                    count ++;
                    if(j != i / j) count ++;
                }
            }
            list.add(count);
            count = 0;
        }
        for(int num : list){
            answer += num > limit ? power : num;
        }
        return answer;
    }
}