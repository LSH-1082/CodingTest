import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = br.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int x = Integer.parseInt(parts[1]);
        String[] ns = br.readLine().split(" ");
        int[] nums = Arrays.stream(ns).mapToInt(Integer::parseInt).toArray();
        for(int num : nums) {
            if(num < x) bw.write(num + " ");
        }
        bw.flush();
    }
}