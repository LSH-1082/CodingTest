import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            char[] num = String.valueOf(i).toCharArray();
            int tmp = 0;
            for(char c : num){
                tmp += c - '0';
            }
            tmp += i;
            if(n == tmp) {
                bw.write(i+"");
                bw.flush();
                return;
            }
        }

        bw.write("0");
        bw.flush();
    }
}
