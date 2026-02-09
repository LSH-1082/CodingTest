import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int cash = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            if(cash / nums[i] >= 1) {
                cnt += cash / nums[i];
                cash %= nums[i];
            }
        }

        bw.write(cnt + "");
        bw.flush();
    }
}
