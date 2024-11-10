import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
    }
}