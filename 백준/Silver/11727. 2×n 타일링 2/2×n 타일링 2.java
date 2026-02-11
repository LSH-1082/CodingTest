import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(func(n) + "");
        
        bw.flush();
    }

    public static int func(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++) {
            num = i % 2 == 0 ? (num*2 + 1) : (num*2 - 1);
            num %= 10007;
        }
        return num;
    }
}
