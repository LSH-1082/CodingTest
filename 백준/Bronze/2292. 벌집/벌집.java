import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int tmp = 1;
        while(true) {
            if(tmp >= n) break;
            cnt++;
            tmp += 6 * cnt;
        }

        bw.write((cnt + 1) + "");
        bw.flush();
    }
}
