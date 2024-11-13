import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i).charAt(n) > list.get(j).charAt(n)) {
                    String tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
                if(list.get(i).charAt(n) == list.get(j).charAt(n)) {
                    String[] str = {list.get(i), list.get(j)};
                    Arrays.sort(str);
                    list.set(i, str[0]);
                    list.set(j, str[1]);
                }
            }
        }

        return list.toArray(new String[0]);
    }
}