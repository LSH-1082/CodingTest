import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int minPack = Integer.MAX_VALUE;
        int minSpe = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int pack = Integer.parseInt(st.nextToken());
            int spe = Integer.parseInt(st.nextToken());

            if(minPack > pack) minPack = pack;
            if(minSpe > spe) minSpe = spe;
        }

        int case1 = ((n + 5) / 6) * minPack;
        
        int case2 = n * minSpe;
        
        int case3 = (n / 6) * minPack + (n % 6) * minSpe;

        answer = Math.min(case1, Math.min(case2, case3));

        bw.write(answer + "");
        bw.flush();
    }
}