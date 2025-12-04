import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for(int j = 0; j < s[1].length(); j++) {
                for(int k = 0; k < Integer.parseInt(s[0]); k++){
                    bw.write(s[1].charAt(j));
                }
            }
            bw.newLine();
        }
        bw.flush();
    }
}
