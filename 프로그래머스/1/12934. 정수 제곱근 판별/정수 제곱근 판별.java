class Solution {
    public long solution(long n) {
		double num = Math.sqrt(n);
        long answer = 0;
        if(Math.floor(num) == num) answer = (long)Math.pow(num + 1, (double) 2);
        else answer = -1;
        return answer;
    }
}