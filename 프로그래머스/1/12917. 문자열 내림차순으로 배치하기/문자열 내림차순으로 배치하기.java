import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i) < list.get(j)) {
                    char tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}