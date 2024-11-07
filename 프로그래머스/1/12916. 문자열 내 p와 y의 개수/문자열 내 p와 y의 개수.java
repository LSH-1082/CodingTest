import java.util.HashMap;
import java.util.Objects;

class Solution {
    boolean solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String lowStr = s.toLowerCase();
        for(int i = 0; i < lowStr.length(); i++) {
            if('p' == lowStr.charAt(i) || 'y' == lowStr.charAt(i)) map.put(lowStr.charAt(i), map.getOrDefault(lowStr.charAt(i), 0) + 1);
        }
        return (Objects.equals(map.get('y'), map.get('p')));
    }
}