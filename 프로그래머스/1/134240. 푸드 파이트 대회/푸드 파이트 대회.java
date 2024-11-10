import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String solution(int[] food) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < food.length; i++) {
            map.put(i, food[i] % 2 == 0 ? food[i] : food[i] - 1);
        }
        list.add("0");
        for(int i = map.size(); i > 0; i--){
            for(int j = 0; j < map.get(i) / 2; j++){
                list.add(0, String.valueOf(i));
                list.add(String.valueOf(i));
            }
        }
        String answer = "";
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}