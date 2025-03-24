class Solution {
    public static int solution(int n, int m, int[] section) {
        int count = 0;
        int num = 0;
        for(int sec : section) {
            if(num < sec) {
                num = sec + m - 1;
                count++;
            }
            else continue;
        }
        return count;
    }
}