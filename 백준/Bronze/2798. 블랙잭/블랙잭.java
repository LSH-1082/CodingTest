import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int max = 0;
        for(int i = n[0] - 1; i > -1; i--) {
            for(int j = i - 1; j > - 1; j--) {
                for(int k = j - 1; k > -1; k--) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum <= n[1] && sum >= max) max = sum;
                }
            }
        }
        bw.write(max + "");
        bw.flush();
    }
}
