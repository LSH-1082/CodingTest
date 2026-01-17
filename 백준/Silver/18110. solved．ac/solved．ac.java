import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> ls = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        int cutAvg = (int)Math.round(n * 0.15);

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            ls.add(num);
        }

        ls.sort(Integer::compare);

        int total = 0;
        for(int i = cutAvg; i < ls.size() - cutAvg; i++) {
            total += ls.get(i);
        }

        int answer = (int)Math.round((float)total / (ls.size() - (2 * cutAvg)));
        bw.write(answer + "");
        bw.flush();
    }
}