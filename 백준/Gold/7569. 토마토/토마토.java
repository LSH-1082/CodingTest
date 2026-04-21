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
        int h = Integer.parseInt(st.nextToken());
        int[][][] arr = new int[h][n][m];
        ArrayList<Point> startPoint = new ArrayList<>();
        int cntZero = 0;
        int answer = 0;

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < m; k++) {
                    int num = Integer.parseInt(st.nextToken());
                    if(num == 1) startPoint.add(new Point(k, j, i));
                    else if(num == 0) cntZero++;
                    arr[i][j][k] = num;
                }
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
                int hh = p.h;

                if(x - 1 >= 0 && arr[hh][y][x - 1] != 1 && arr[hh][y][x - 1] != -1) {
                    arr[hh][y][x - 1] = 1;
                    q.add(new Point(x - 1, y, hh));
                    cntZero--;
                }
                if(x + 1 < m && arr[hh][y][x + 1] != 1 && arr[hh][y][x + 1] != -1) {
                    arr[hh][y][x + 1] = 1;
                    q.add(new Point(x + 1, y, hh));
                    cntZero--;
                }
                if(y - 1 >= 0 && arr[hh][y - 1][x] != 1 && arr[hh][y - 1][x] != -1) {
                    arr[hh][y - 1][x] = 1;
                    q.add(new Point(x, y - 1, hh));
                    cntZero--;
                }
                if(y + 1 < n && arr[hh][y + 1][x] != 1 && arr[hh][y + 1][x] != -1) {
                    arr[hh][y + 1][x] = 1;
                    q.add(new Point(x, y + 1, hh));
                    cntZero--;
                }
                if(hh - 1 >= 0 && arr[hh - 1][y][x] != 1 && arr[hh - 1][y][x] != -1) {
                    arr[hh - 1][y][x] = 1;
                    q.add(new Point(x, y, hh - 1));
                    cntZero--;
                }
                if(hh + 1 < h && arr[hh + 1][y][x] != 1 && arr[hh + 1][y][x] != -1) {
                    arr[hh + 1][y][x] = 1;
                    q.add(new Point(x, y, hh + 1));
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
        int h;
        public Point(int x, int y, int h) {
            this.x = x;
            this.y = y;
            this.h = h;
        }
    }
}