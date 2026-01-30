import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] ls = new ArrayList[n + 1];

        for(int i = 0; i < ls.length; i++) {
            ls[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            ls[n1].add(n2);
            ls[n2].add(n1);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] isVisited = new boolean[n + 1];
        int cnt = 0;
        q.offer(1);

        while(!q.isEmpty()) {
            int now = q.poll();
            isVisited[1] = true;
            for(int num : ls[now]) {
                if(!isVisited[num]){
                    isVisited[num] = true;
                    cnt++;
                    q.add(num);
                }
            }
        }
        bw.write(cnt+"");
        bw.flush();
    }
}