import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int a = 0;
        for(int i = 0; i < 9; i++){
            int n = Integer.parseInt(br.readLine());
            if(n > max) {
                max = n;
                a = i + 1;
            }
        }
        bw.write(max + "\n" + a);
        bw.flush();
    }
}

