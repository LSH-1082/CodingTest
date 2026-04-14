import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[node + 1];

        for(int i = 0; i <= node; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int parentNode = Integer.parseInt(st.nextToken());
            int childrenNode = Integer.parseInt(st.nextToken());

            graph[parentNode].add(childrenNode);
            graph[childrenNode].add(parentNode);
        }

        boolean[] isVisited = new boolean[node + 1];
        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;

        for(int i = 1; i <= node; i++) {
            if(isVisited[i]) continue;

            cnt++;

            isVisited[i] = true;
            q.add(i);

            while(!q.isEmpty()) {
                int num = q.poll();

                for(int n : graph[num]) {
                    if(!isVisited[n]) {
                        isVisited[n] = true;
                        q.add(n);
                    }
                }
            }
        }

        bw.write(cnt + "");
        bw.flush();
        br.close();
        bw.close();
    }
}