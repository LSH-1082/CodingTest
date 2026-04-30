
import java.util.HashMap;

public class Solution {
    public int solution(String[] babbling) {
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('a', "aya");
        hm.put('y', "ye");
        hm.put('w', "woo");
        hm.put('m', "ma");

        int cnt = 0;

        for(String str : babbling) {
            StringBuilder sb = new StringBuilder(str);
            boolean canBabbling = true;
            String prevString = "";

            while(sb.length() > 0 && canBabbling) {
                char c = sb.charAt(0);
                String tmp = "";
                
                int leng = hm.getOrDefault(c, "").length();

                if(leng == 0 || sb.length() < leng) {
                    canBabbling = false;
                    break;
                }

                tmp = sb.substring(0, leng);

                if(tmp.equals(hm.get(c)) && !tmp.equals(prevString)) {
                    sb.delete(0, leng);
                    prevString = tmp;
                }
                else canBabbling = false;
            }
            if(canBabbling) cnt++;
        }

        return cnt;
    }
}
