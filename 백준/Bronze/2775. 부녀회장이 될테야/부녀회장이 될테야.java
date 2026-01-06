import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int a = 1;
        for (int i = 0; i < n; i++) {
            int floor = Integer.parseInt(br.readLine());
            int rNum = Integer.parseInt(br.readLine());
            for (int j = 0; j < floor + 1; j++) {
                a *= (floor + rNum - j);
                a /= (j + 1);
            }
            bw.write(a + "\n");
            a = 1;
        }
        bw.flush();
    }
}