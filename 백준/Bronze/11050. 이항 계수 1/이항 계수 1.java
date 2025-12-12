import java.io.*;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = 1;
        int b = 1;
        for(int i = n[0]; i >= n[0] - n[1] + 1; i--) {
            a *= i;
        }
        for(int i = 2; i <= n[1]; i++) {
            b *= i;
        }
        bw.write(a/b + "");
        bw.flush();
    }
}