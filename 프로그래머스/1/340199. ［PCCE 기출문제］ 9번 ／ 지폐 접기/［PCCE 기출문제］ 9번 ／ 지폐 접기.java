public class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        boolean[] bool1 = {false, false};
        boolean[] bool2 = {false, false};
        while(true){
            if(wallet[0] >= bill[0]){
                bool1[0] = true;
            }
            if(wallet[1] >= bill[0]){
                bool1[1] = true;
            }
            if(wallet[0] >= bill[1]){
                bool2[0] = true;
            }
            if(wallet[1] >= bill[1]){
                bool2[1] = true;
            }

            if((bool1[0] || bool1[1]) && (bool2[0] || bool2[1]) && (bool1[0] || bool2[0]) && (bool1[1] || bool2[1])) break;
            else{
                bool1[0] = false;
                bool1[1] = false;
                bool2[0] = false;
                bool2[1] = false;
                if(bill[0] >= bill[1]) bill[0] /= 2;
                else bill[1] /= 2;
                answer++;
            }
        }
        return answer;
    }
}