import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static int solution(int k, int m, int[] score) {
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int answer = 0;
        int count = m;
        int[] tmp = new int[m];
        for (Integer integer : arr) {
            tmp[count - 1] = integer;
            count--;
            if (count == 0) {
                answer += (tmp[0] * m);
                count = m;
            }
        }
        return answer;
    }
}