import java.util.HashMap;

class Solution {
    public long solution(long n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c - '0', map.containsKey(c - '0') ? map.get(c - '0') + 1 : 1);
        }
        str = "";
        for(int i = 9; i >= 0; i--) {
            if(map.get(i) != null){
                for(int j = 0; j < map.get(i); j++) {
                    str += String.valueOf(i);
                }
            }
        }
        return Long.parseLong(str);
    }
}