class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i < goal.length; i++) {
            if(cards1.length > n1 && goal[i].equals(cards1[n1])) n1++;
            else if(cards2.length > n2 && goal[i].equals(cards2[n2])) n2++;
            else return "No";
        }
        return "Yes";
    }
}