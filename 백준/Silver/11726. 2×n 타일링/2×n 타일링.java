import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(dpFunc(n) + "");
        bw.flush();

    }

    public static int dpFunc(int num) {
        int[] dp = new int[3];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= num; i++) {
            dp[i % 3] = (dp[(i - 2) % 3] + dp[(i - 1) % 3]) % 10007;
        }
        return dp[num % 3];
    }
}