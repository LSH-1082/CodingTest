import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append(br.readLine());
        if(sb.charAt(0) == ' ') sb.replace(0, 1, "");
        if(sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ') sb.replace(sb.length() - 1, sb.length() - 1, "");

        bw.write(sb.length() == 0 ? "0" : sb.toString().split(" ").length + "");
        bw.flush();
    }
}
