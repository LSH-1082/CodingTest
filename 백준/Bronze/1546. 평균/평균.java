import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        float total = 0;
        for(int i = 0; i < n; i++){
            total += (float) nums[i] / nums[n - 1] * 100;
        }
        bw.write(total/n + "");
        bw.flush();
    }
}
