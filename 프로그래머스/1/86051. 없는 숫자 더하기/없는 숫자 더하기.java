class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean flag = false;
        for(int i = 0; i < 10; i++) {
            for(int number : numbers){
                if(number == i) {
                    flag = true;
                    break;
                }
            }
            if(!flag) answer += i;
            flag = false;
        }
        return answer;
    }
}