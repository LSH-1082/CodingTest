import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringBuilder answer = new StringBuilder();
        for(char c : s.toCharArray()){
            if('A'  <= c && c <= 'Z') answer.append((char) (c + 32));
            else if('a'  <= c && c <= 'z') answer.append((char) (c - 32));
        }
        bw.write(answer.toString());
        bw.flush();
    }
}

