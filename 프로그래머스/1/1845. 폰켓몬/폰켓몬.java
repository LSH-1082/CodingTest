import java.util.HashMap;

class Solution {
    public static int solution(int[] nums) {
        int max = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return Math.min(map.size(), max);
    }
}