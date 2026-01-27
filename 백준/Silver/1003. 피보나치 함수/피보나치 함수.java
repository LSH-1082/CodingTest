import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        while(n --> 0) {
            int num = Integer.parseInt(br.readLine());
            int[][] count = new int[num + 1][2];
            fibo(num, count);
            bw.write(count[num][0] + " " + count[num][1] + "\n");
        }

        bw.flush();
    }

    public static void fibo(int num, int[][] count) {
        count[0][0] = 1;
        count[0][1] = 0;
        if(num == 0) return;
        count[1][0] = 0;
        count[1][1] = 1;
        if(num == 1) return;

        for(int i = 2; i <= num; i++) {
            count[i][0] = count[i - 1][0] + count[i - 2][0];
            count[i][1] = count[i - 1][1] + count[i - 2][1];
        }
    } 
}