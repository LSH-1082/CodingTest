import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int notClearPlayer = 0;
        int clearPlayer = 0;
        HashMap<Integer, Float> map = new HashMap<>();
        for (int i = 1; i < N + 1; i++) {
            for (int num : stages) {
                if(i == num) notClearPlayer++;
                else if(i < num) clearPlayer++;
            }
            float failRate = (float) notClearPlayer / (clearPlayer + notClearPlayer);
            map.put(i, clearPlayer + notClearPlayer == 0 ? 0 : failRate);
            notClearPlayer = 0;
            clearPlayer = 0;
        }

        List<Map.Entry<Integer, Float>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((e1, e2) -> {
            int cmp = e2.getValue().compareTo(e1.getValue());
            if (cmp == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return cmp;
        });

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Float> entry : entryList) {
            list.add(entry.getKey());
        }

        return Arrays.stream(list.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
    }
}