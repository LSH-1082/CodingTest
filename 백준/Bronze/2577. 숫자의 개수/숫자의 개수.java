import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Character, Integer> hm = new HashMap<>();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int result = a * b * c;

        for(int i = 0; i < 10; i++){
            hm.put((char) (i+48), 0);
        }

        for(char ch : String.valueOf(result).toCharArray()){
            hm.put(ch, hm.get(ch) + 1);
        }

        for(int i = 0; i < 10; i++){
            bw.write(hm.get((char) (i + 48)) + "\n");
        }
        bw.flush();
    }
}
