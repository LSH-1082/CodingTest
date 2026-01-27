import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[][] count = new int[41][2];
        fibo(count);

        while(n --> 0) {
            int num = Integer.parseInt(br.readLine());
            bw.write(count[num][0] + " " + count[num][1] + "\n");
        }

        bw.flush();
    }

    public static void fibo(int[][] count) {
        count[0][0] = 1;
        count[0][1] = 0;
        count[1][0] = 0;
        count[1][1] = 1;

        for(int i = 2; i <= 40; i++) {
            count[i][0] = count[i - 1][0] + count[i - 2][0];
            count[i][1] = count[i - 1][1] + count[i - 2][1];
        }
    } 
}