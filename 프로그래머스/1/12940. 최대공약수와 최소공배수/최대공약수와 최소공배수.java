class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        answer[0] = gcd(max, min);
        answer[1] = answer[0] == 1 ? max * min : max * min /answer[0];
        return answer;
    }

    public int gcd(int max, int min) {
        int result = max % min;
        return result == 0 ? min : gcd(min, result);
    }
}
