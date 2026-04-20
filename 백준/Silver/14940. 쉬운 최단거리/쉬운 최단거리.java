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
        int[] start = new int[2];


        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == 2) {
                    start[0] = i;
                    start[1] = j;
                }
                maze[i][j] = num == 1 ? -1 : num;
            }
        }

        q.add(new Point(start[0], start[1]));
        maze[start[0]][start[1]] = 0;
        int cnt = 0;
        while(!q.isEmpty()) {
            int size =  q.size();
            cnt++;
            for(int i = 0; i < size; i++) {
                Point p = q.poll();

                if(p.x - 1 >= 0 && maze[p.x - 1][p.y] != 0 && maze[p.x - 1][p.y] == -1) {
                    q.add(new Point(p.x - 1, p.y));
                    maze[p.x - 1][p.y] = cnt;
                }
                if(p.x + 1 < n && maze[p.x + 1][p.y] != 0 && maze[p.x + 1][p.y] == -1) {
                    q.add(new Point(p.x + 1, p.y));
                    maze[p.x + 1][p.y] = cnt;
                }
                if(p.y - 1 >= 0 && maze[p.x][p.y - 1] != 0 && maze[p.x][p.y - 1] == -1) {
                    q.add(new Point(p.x, p.y - 1));
                    maze[p.x][p.y - 1] = cnt;
                }
                if(p.y + 1 < m && maze[p.x][p.y + 1] != 0 && maze[p.x][p.y + 1] == -1) {
                    q.add(new Point(p.x, p.y + 1));
                    maze[p.x][p.y + 1] = cnt;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                bw.write(maze[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
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