class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        double answer = (double) sum / arr.length;
        return answer;
    }
}