import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += (int) Math.pow(nums[i], 2);
        }
        bw.write(sum % 10 + "");
        bw.flush();
    }
}