import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new LinkedList<>();
        for (int num : arr) {
            if(list.isEmpty() || list.get(list.size()-1) != num){
                list.add(num);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
