class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] nums = new int[n + 1];
        for(int i = 1; i < n + 1; i++){
            nums[i] = i;
        }

        for(int i = 2; i < n + 1; i++){
            if(nums[i] == 0) continue;
            for(int j = i * 2; j < n + 1; j+=i){
                nums[j] = 0;
            }
        }

        for(int i = 2; i < n + 1; i++){
            if(nums[i] != 0) answer++;
        }
        return answer;
    }
}