class Solution {
    public int solution(int left, int right) {
        int cnt = 0;
        int answer = 0;
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) cnt += 1;
            }
            answer = cnt % 2 == 0 ? answer + i : answer - i;
            cnt = 0;
        }
        return answer;
    }
}