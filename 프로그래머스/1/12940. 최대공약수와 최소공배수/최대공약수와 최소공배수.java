class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        answer[0] = mod(max, min);
        answer[1] = answer[0] == 1 ? max * min : answer[0] * (max/answer[0]) * (min/answer[0]);
        return answer;
    }

    public int mod(int max, int min) {
        int result = max % min;
        return result == 0 ? min : mod(min, result);
    }
}
