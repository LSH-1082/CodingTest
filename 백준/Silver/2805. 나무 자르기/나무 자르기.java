import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int maxHeight = 0;

        st = new StringTokenizer(br.readLine());

        int i = 0;
        while(st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > maxHeight) maxHeight = arr[i];
            i++;
        }

        int low = 1;
        int high = maxHeight;
        int answer = 0;
        while(low <= high) {
            long total = 0;
            int mid = low + (high - low) / 2;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > mid) total += arr[j] - mid;
            }

            if(total >= m) {
                answer = mid;
                low = mid + 1;
            }
            else if(total > m) low = mid;
            else high = mid - 1;
        }
        bw.write(answer + "");
        bw.flush();
    }	
}