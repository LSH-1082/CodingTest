import java.util.ArrayList;

class Solution {
    public static int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[4]; // 0번 인덱스는 사용하지 않음

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) scores[1]++;
            if (answers[i] == second[i % second.length]) scores[2]++;
            if (answers[i] == third[i % third.length]) scores[3]++;
        }

        int max = Math.max(scores[1], Math.max(scores[2], scores[3]));

        for (int i = 1; i <= 3; i++) {
            if (scores[i] == max) list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}