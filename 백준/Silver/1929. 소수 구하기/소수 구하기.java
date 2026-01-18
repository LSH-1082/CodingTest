import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int cnt = 0;
        for(int i = n[0]; i <= n[1]; i++) {
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i != 1 && i % j == 0) cnt++;
            }
            if(cnt == 1) bw.write(i + "\n");
            cnt = 0;
        }
        bw.flush();
    }
}