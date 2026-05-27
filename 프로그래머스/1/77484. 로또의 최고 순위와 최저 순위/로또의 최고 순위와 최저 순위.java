class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int zeroCnt = 0;
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];

        for(int n : lottos) {
            if(n == 0) {
                zeroCnt++;
                continue;
            }

            for(int nn : win_nums) {
                if(n == nn) {
                    cnt++;
                    break;
                }
            }
        }

        answer[0] = rank[cnt + zeroCnt];
        answer[1] = rank[cnt];

        System.out.println(answer[0] + " " + answer[1]);

        return answer;
    }
}