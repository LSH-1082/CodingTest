import java.io.*;
import java.util.Comparator;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> s = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            s.add(br.readLine());
        }
        s.stream().sorted(Comparator.comparing(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER)).forEach((x) -> {
            try {
                bw.write(x + "\n");
            } catch (IOException e) {
            }
        });
        bw.flush();
    }
}