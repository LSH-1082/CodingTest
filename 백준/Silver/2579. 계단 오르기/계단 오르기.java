import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n + 1];
        int[] dp = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = score[1];
        if (n >= 2) {
            dp[2] = score[1] + score[2];
        }
        if (n >= 3) {
            dp[3] = Math.max(score[1] + score[3], score[2] + score[3]);
        }

        for(int i = 4; i <= n; i++) {
            dp[i] = Math.max(dp[i - 3] + score[i - 1] + score[i], dp[i - 2] + score[i]);
        }
        bw.write(dp[n] + "");
        bw.flush();
    }	
}