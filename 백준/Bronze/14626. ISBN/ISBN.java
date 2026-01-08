import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] c = br.readLine().toCharArray();
        int tmp = 0;
        int cnt = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] == '*') {
                cnt = i;
                continue;
            }
            int n = c[i] - '0';
            tmp += i % 2 == 0 ? n : (n * 3);
        }
        tmp = (10 - (tmp % 10)) % 10;
        if (cnt % 2 == 1){
            for(int i = 0; i < 10; i++) {
                if((3 * i) % 10 == tmp){
                    tmp = i;
                    break;
                }
            }
        }
        bw.write(tmp + "");
        bw.flush();
    }
}