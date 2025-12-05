import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Character, Integer> hm = new HashMap<>();

        char[] chars = br.readLine().toCharArray();
        for(int i = 0; i < 26; i++) {
            hm.put((char) ('a' + i), -1);
        }
        for(int i = 0; i < chars.length; i++){
            if(hm.get(chars[i]) == -1) hm.put(chars[i], i);
        }
        for(int i = 0; i < 26; i++) {
            bw.write(hm.get((char) ('a' + i)) + " ");
        }
        bw.flush();
    }
}
