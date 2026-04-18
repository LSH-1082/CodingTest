import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            Queue<Integer> q = new LinkedList<>();
            int m = 0;

            m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                set.add(Integer.valueOf(st.nextToken()));
            }

            m = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                q.add(Integer.valueOf(st.nextToken()));
            }

            while(!q.isEmpty()) {
                if(set.contains(q.poll())) bw.write("1\n");
                else bw.write("0\n");
            }
        }
        bw.flush();
    }
}