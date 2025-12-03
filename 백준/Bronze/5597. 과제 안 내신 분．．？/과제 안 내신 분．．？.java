import java.io.*;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 1; i < 31; i++) {
            set.add(i);
        }

        for(int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            set.remove(n);
        }
        for(int n : set){
            bw.write(n + "\n");
        }
        bw.flush();
    }
}