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

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        ArrayList<Point> startPoint = new ArrayList<>();
        int cntZero = 0;
        int answer = 0;


        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == 0) cntZero++;
                else if(num == 1) {
                    startPoint.add(new Point(j, i));
                }
                arr[i][j] = num;
            }
        }

        Queue<Point> q = new LinkedList<>();
        for(int i = 0; i < startPoint.size(); i++) {
            q.add(startPoint.get(i));
        }


        while(!q.isEmpty() && cntZero > 0) {
            int size = q.size();
            answer++;
            for(int i = 0; i < size; i++) {
                Point p = q.poll();
                int x = p.x;
                int y = p.y;

                if(x - 1 >= 0 && arr[y][x - 1] != 1 && arr[y][x - 1] != -1) {
                    arr[y][x - 1] = 1;
                    q.add(new Point(x - 1, y));
                    cntZero--;
                }
                if(x + 1 < m && arr[y][x + 1] != 1 && arr[y][x + 1] != -1) {
                    arr[y][x + 1] = 1;
                    q.add(new Point(x + 1, y));
                    cntZero--;
                }
                if(y - 1 >= 0 && arr[y - 1][x] != 1 && arr[y - 1][x] != -1) {
                    arr[y - 1][x] = 1;
                    q.add(new Point(x, y - 1));
                    cntZero--;
                }
                if(y + 1 < n && arr[y + 1][x] != 1 && arr[y + 1][x] != -1) {
                    arr[y + 1][x] = 1;
                    q.add(new Point(x, y + 1));
                    cntZero--;
                }
            }
        }

        if(cntZero != 0) bw.write("-1");
        else bw.write(answer + "");
        bw.flush();
    }

    static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}