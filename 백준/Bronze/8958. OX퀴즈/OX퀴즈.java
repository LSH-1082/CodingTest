import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        int total = 0;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(char c : s.toCharArray()){
                if(c == 'O') cnt++;
                else {
                    total += (cnt*(cnt + 1)) / 2;
                    cnt = 0;
                }
            }
            total += (cnt*(cnt + 1)) / 2;
            cnt = 0;
            bw.write(total + "\n");
            total = 0;
        }
        bw.flush();
    }
}
