import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        ArrayList<String> list = new ArrayList<>();
        int answer = 0;
        for(int i = 0; i <= t.length() - p.length(); i++) {
            list.add(t.substring(i, i+p.length()));
        }

        for(String str : list) {
            if(Long.parseLong(str) <= Long.parseLong(p)) answer += 1;
        }
        return answer;
    }
}