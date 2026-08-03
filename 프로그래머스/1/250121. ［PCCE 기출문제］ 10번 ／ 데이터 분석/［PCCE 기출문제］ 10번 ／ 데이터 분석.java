import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Stream;

class Solution {
    private static final HashMap<String, Integer> hm = new HashMap<>();
    Solution() {
        hm.put("code", 0);
        hm.put("date", 1);
        hm.put("maximum", 2);
        hm.put("remain", 3);
    }

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int standardData = hm.get(ext);
        int standardSortValue = hm.get(sort_by);

        int[][] answer = Stream.of(data).filter(v -> v[standardData] < val_ext).sorted(Comparator.comparingInt(v -> v[standardSortValue])).toArray(int[][]::new);

        return answer;
    }
}