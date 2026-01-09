import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt_2 = 0;
        int cnt_5 = 0;
        for(int i = 1; i <= n; i++){
            int tmp = i;
            while(tmp % 2 == 0) {
                tmp /= 2;
                cnt_2++;
            }
            tmp = i;
            while(tmp % 5 == 0){
                tmp /= 5;
                cnt_5++;
            }
        }
        bw.write((cnt_2 - cnt_5 > 0 ? cnt_5 : cnt_2) + "");
        bw.flush();
    }
}