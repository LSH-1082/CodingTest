import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t_c = 0;
        int[] p_c = {0, 0};
        int total = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] var = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int num : nums){
            t_c += (num / var[0]) + (num % var[0] == 0 ? 0 : 1);
        }
        bw.write(t_c+"\n");
        p_c[0] = total / var[1];
        p_c[1] = total - (p_c[0] * var[1]);
        bw.write(p_c[0]+" " + p_c[1]);
        bw.flush();
    }
}
