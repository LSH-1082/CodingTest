import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        if(s.charAt(0) == 'F') {
            bw.write("0.0");
            bw.flush();
            return;
        }
        float n = 69 - s.charAt(0);
        switch(s.charAt(1)){
            case '+':
                n += 0.3;
                break;
            case '-':
                n -= 0.3;
                break;
        }
        bw.write(n + "");
        bw.flush();
    }
}

