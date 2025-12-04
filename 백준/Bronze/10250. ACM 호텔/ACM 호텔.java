import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(num[0] >= num[2]) bw.write(num[2] + "01\n");
            else{
                String pre = (
                    num[2] % num[0] == 0 ? num[0] : num[2] % num[0]
                ) + "";
                String sub = String.format("%02d\n", (
                    num[2] % num[0] == 0 ? num[2] / num[0] : (num[2] / num[0]) + 1)
                );
                bw.write(pre + sub);
            }
        }
        bw.flush();
    }
}
