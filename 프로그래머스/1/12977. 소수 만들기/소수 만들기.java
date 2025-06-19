class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    int total = nums[i] + nums[j] + nums[k];
                    for(int a = 1; a < total; a++){
                        if(total % a == 0) count++;
                    }
                    if(count == 1) answer++;
                    count = 0;
                }
            }
        }
        return answer;
    }
}