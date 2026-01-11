import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt;
        int a = n / 5; 
        int min = 10000;
        for(int i = a; i >= 0; i--) {
            if((n - (5 * i)) % 3 == 0){
                int tmp = i + ((n - (5 * i)) / 3);
                min = min > tmp ? tmp : min;
            }
        }
        cnt = min != 10000 ? min : -1;

        bw.write(cnt + "");
        bw.flush();
    }
}