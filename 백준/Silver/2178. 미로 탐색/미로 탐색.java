import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Point> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] maze = new int [n][m];
        boolean[][] isVisited = new boolean[n][m];


        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }

        q.add(new Point(0, 0));
        isVisited[0][0] = true;
        int cnt = 0;
        while(!q.isEmpty()) {
            int size =  q.size();
            cnt++;
            for(int i = 0; i < size; i++) {
                Point p = q.poll();
                if(p.x == n - 1 && p.y == m - 1) {
                    bw.write(cnt + "");
                    bw.flush();
                    return;
                }
                if(p.x - 1 >= 0 && maze[p.x - 1][p.y] != 0 && !isVisited[p.x - 1][p.y]) {
                    q.add(new Point(p.x - 1, p.y));
                    isVisited[p.x - 1][p.y] = true;
                }
                if(p.x + 1 < n && maze[p.x + 1][p.y] != 0 && !isVisited[p.x + 1][p.y]) {
                    q.add(new Point(p.x + 1, p.y));
                    isVisited[p.x + 1][p.y] = true;
                }
                if(p.y - 1 >= 0 && maze[p.x][p.y - 1] != 0 && !isVisited[p.x][p.y - 1]) {
                    q.add(new Point(p.x, p.y - 1));
                    isVisited[p.x][p.y - 1] = true;
                }
                if(p.y + 1 < m && maze[p.x][p.y + 1] != 0 && !isVisited[p.x][p.y + 1]) {
                    q.add(new Point(p.x, p.y + 1));
                    isVisited[p.x][p.y + 1] = true;
                }
            }
        }
    }

    static class Point {
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        int x;
        int y;
    }
}