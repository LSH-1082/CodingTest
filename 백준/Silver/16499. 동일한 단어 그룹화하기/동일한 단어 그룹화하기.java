import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++) {
            char[] chars = br.readLine().toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            set.add(str);
        }
        bw.write(set.size() + "");
        bw.flush();
    }
}