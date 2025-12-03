import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double[] nums = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::valueOf).toArray();
        bw.write(String.format("%.0f",(nums[0] * nums[0]) - (nums[1] * nums[1])));
        bw.flush();
    }
}