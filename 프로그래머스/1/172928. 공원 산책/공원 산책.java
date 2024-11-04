import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int[] point = new int[2];
        int num = 0;
        for (String p : park) {
            char[] tmp = p.toCharArray();
            list.add(new String(tmp));
        }

        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.get(i).length(); j++) {
                if(list.get(i).charAt(j) == 'S') {
                    point[0] = i;
                    point[1] = j;
                }
            }
        }

        for (String r : routes) {
            String[] tmp = r.split(" ");
            map.put(tmp[0], Integer.parseInt(tmp[1]));
            switch (tmp[0]) {
                case "E":
                    if (point[1] + map.get(tmp[0]) < list.get(point[1]).length()) {
                        for(map.get(tmp[0]); map.get(tmp[0]) > 0; map.put(tmp[0], map.get(tmp[0]) - 1)) {
                            if (list.get(point[0]).charAt(point[1] + num + 1) != 'X') {
                                num += 1;
                            }
                            else if(list.get(point[0]).charAt(point[1] + num + 1) == 'X') {
                                num = 0;
                                break;
                            }
                        }
                    }
                    point[1] += num;
                    num = 0;
                    break;
                case "W":
                    if (point[1] - map.get(tmp[0]) >= 0) {
                        for(map.get(tmp[0]); map.get(tmp[0]) > 0; map.put(tmp[0], map.get(tmp[0]) - 1)) {
                            if (list.get(point[0]).charAt(point[1] - (num + 1)) != 'X') {
                                num += 1;
                            }
                            else if(list.get(point[0]).charAt(point[1] - (num + 1)) == 'X') {
                                num = 0;
                                break;
                            }
                        }
                    }
                    point[1] -= num;
                    num = 0;
                    break;
                case "N":
                    if (point[0] - map.get(tmp[0]) >= 0) {
                        for(map.get(tmp[0]); map.get(tmp[0]) > 0; map.put(tmp[0], map.get(tmp[0]) - 1)) {
                            if (list.get(point[0] - (num + 1)).charAt(point[1]) != 'X') {
                                num += 1;
                            }
                            else if(list.get(point[0] - (num + 1)).charAt(point[1]) == 'X') {
                                num = 0;
                                break;
                            }
                        }
                    }
                    point[0] -= num;
                    num = 0;
                    break;
                case "S":
                    if (point[0] + map.get(tmp[0]) < list.size()) {
                        for(map.get(tmp[0]); map.get(tmp[0]) > 0; map.put(tmp[0], map.get(tmp[0]) - 1)) {
                            if (list.get(point[0] + num + 1).charAt(point[1]) != 'X') {
                                num += 1;
                            }
                            else if(list.get(point[0] + num + 1).charAt(point[1]) == 'X') {
                                num = 0;
                                break;
                            }
                        }
                    }
                    point[0] += num;
                    num = 0;
                    break;
            }
        }
        return point;
    }
}