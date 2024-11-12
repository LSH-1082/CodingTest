import java.util.ArrayList;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++){
                list.add(array[j]);
            }
            list.sort(Integer::compareTo);
            answer[i] = list.get(commands[i][2] - 1);
            list.clear();
        }
        return answer;
    }
}