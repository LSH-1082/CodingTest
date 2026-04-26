import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 0; i < n; i++) {
            String str = br.readLine();

            if(str.equals("ENTER")) {
                answer += set.size();
                set.clear();
            }
            else set.add(str);
        }

        answer += set.size();

        bw.write(answer + "");
        bw.flush();
    }
}

