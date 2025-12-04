import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int answer = 0;
        for(int i = 0; i < n; i++){
            answer += Integer.parseInt(s.charAt(i)+"");
        }
        bw.write(answer+"");
        bw.flush();
    }
}