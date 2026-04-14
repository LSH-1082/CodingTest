import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static int cnt = 0;
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

        for(int i = 1; i <= node; i++) {
            if(!isVisited[i]) cnt++;
            dfs(graph, isVisited, i);
        }


        bw.write(cnt + "");
        bw.flush();
        br.close();
        bw.close();
    }

    public static void dfs(ArrayList<Integer>[] graph, boolean[] isVisited, int startNode) {
        isVisited[startNode] = true;

        for(int num : graph[startNode]) {
            if(!isVisited[num]) {
                dfs(graph, isVisited, num);
            }
        }
    }
}