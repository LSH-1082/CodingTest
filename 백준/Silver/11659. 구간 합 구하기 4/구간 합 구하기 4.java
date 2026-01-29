import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer sb = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(sb.nextToken());
        int m = Integer.parseInt(sb.nextToken());

        int[] num = new int[n];
        sb = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(sb.nextToken()) + (i == 0 ? 0 : num[i - 1]);
        }
        
        for(int i = 0; i < m; i++) {
            sb = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(sb.nextToken());
            int b = Integer.parseInt(sb.nextToken());
            bw.write((num[b - 1] - (a == 1 ? 0 : num[a - 2])) + "\n");
        }
        bw.flush();
    }
}