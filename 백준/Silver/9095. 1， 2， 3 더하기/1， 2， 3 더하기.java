import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n --> 0) {
            int num = Integer.parseInt(br.readLine());
            bw.write(dpFunc(num) + "\n");
        }
        bw.flush();
    }

    public static int dpFunc(int num) {
        if(num < 4) {
            if(num % 3 == 0) return num + 1;
            else return num;
        }
        int[] dp = new int[num + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4; i <= num; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        return dp[num];
    }
}