
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int[][] field = new int[n][m];

            int k = Integer.parseInt(st.nextToken());
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                field[b][a] = 1;
            }
            bw.write(func(field) + "\n");
        }
        bw.flush();
    }

    public static int func(int[][] field) {
        int cnt = 0;
        Queue<Coord> q = new LinkedList<>();

        int y = field.length;
        int x = field[0].length;

        boolean[][] isVisited = new boolean[y][x];

        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                if(!isVisited[i][j] && field[i][j] == 1) {
                    isVisited[i][j] = true;
                    q.offer(new Coord(j, i));
                    cnt++;
                    while(!q.isEmpty()) {
                        Coord c = q.poll();
                        if(c.getX() + 1 < x && field[c.getY()][c.getX() + 1] == 1 && !isVisited[c.getY()][c.getX() + 1]) {isVisited[c.getY()][c.getX() + 1] = true; q.offer(new Coord(c.getX() + 1, c.getY()));}
                        if(c.getX() - 1 >= 0 && field[c.getY()][c.getX() - 1] == 1 && !isVisited[c.getY()][c.getX() - 1]) {isVisited[c.getY()][c.getX() - 1] = true; q.offer(new Coord(c.getX() - 1, c.getY()));}
                        if(c.getY() + 1 < y && field[c.getY() + 1][c.getX()] == 1 && !isVisited[c.getY() + 1][c.getX()]) {isVisited[c.getY() + 1][c.getX()] = true; q.offer(new Coord(c.getX(), c.getY() + 1));}
                        if(c.getY() - 1 >= 0 && field[c.getY() - 1][c.getX()] == 1 && !isVisited[c.getY() - 1][c.getX()]) {isVisited[c.getY() - 1][c.getX()] = true; q.offer(new Coord(c.getX(), c.getY() - 1));}
                    }
                }

            }
        }

        return cnt;
    }
}

class Coord {
    private int x;
    private int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}