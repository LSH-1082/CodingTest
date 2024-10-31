import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String[] solution(String[] players, String[] callings) {
        ArrayList<String> playerList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : players) {
            playerList.add(player);
        }
        for (int i = 0; i < playerList.size(); i++) {
            map.put(playerList.get(i), i);
        }
        for (String calling : callings) {
            int grade = map.get(calling);
            playerList.remove(grade);
            playerList.add(grade - 1, calling);
            map.put(calling, grade - 1);
            map.put(playerList.get(grade), grade);
        }
        return playerList.toArray(new String[playerList.size()]);
    }
}
