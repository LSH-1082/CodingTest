import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> hm = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreElements()) {
            Integer num = Integer.valueOf(st.nextToken());
            q.add(num);
            set.add(num);
        }

        for(int i = 0; i < n; i++) {
            hm.put(set.pollFirst(), i);
        }

        while(!q.isEmpty()) {
            bw.write(hm.get(q.poll()) + " ");
        }


        bw.flush();
    }
}