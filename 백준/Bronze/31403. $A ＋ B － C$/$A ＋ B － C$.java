import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        String str = "";
        for(int i = 0; i < 3; i++){
            String s = br.readLine();
            if(i < 2) {
                sum += Integer.parseInt(s);
                str += s;
            }
            else {
                sum -= Integer.parseInt(s);
                str = (Integer.parseInt(str) - Integer.parseInt(s)) + "";
            }
        }
        bw.write(sum + "\n" + str);
        bw.flush();
    }
}

