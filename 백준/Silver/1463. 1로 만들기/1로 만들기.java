import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n + 1];
        func(num);
        bw.write(num[n] + "");

        bw.flush();
    }

    public static void func(int[] num) {
        num[1] = 0;
        for(int i = 2; i < num.length; i++) {
            num[i] = num[i - 1] + 1;
            if(i % 2 == 0) num[i] = Math.min(num[i], (num[i / 2] + 1));
            if(i % 3 == 0) num[i] = Math.min(num[i], (num[i / 3] + 1));
        }
    } 
}