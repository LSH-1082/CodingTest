import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) map.put(1, map.getOrDefault(1, 0) + 1);
            if (answers[i] == second[i % second.length]) map.put(2, map.getOrDefault(2, 0) + 1);
            if (answers[i] == third[i % third.length]) map.put(3, map.getOrDefault(3, 0) + 1);
        }
        int max = Math.max(map.getOrDefault(1, 0), Math.max(map.getOrDefault(2, 0), map.getOrDefault(3, 0)));
        for (int i = 0; i <= 3; i++) {
            if (map.getOrDefault(i, 0) ==  max) list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}