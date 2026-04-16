import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int maxLength = 0;
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            int len = Integer.parseInt(br.readLine());
            if(len > maxLength) maxLength = len;
            nums[i] = len;
        }

        long low = 1;
        long high = maxLength;
        long answer = 0;

        while(low <= high) {
            long total = 0;
            long mid = low + (high - low) / 2;
            for(int i = 0; i < n; i++) {
                total += (nums[i] / mid);
            }
            if(total >= count) {
                answer = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        bw.write(answer + "");
        bw.flush();
    }
}