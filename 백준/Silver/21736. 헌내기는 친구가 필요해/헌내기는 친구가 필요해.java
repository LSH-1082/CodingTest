import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        boolean[][] isVisted = new boolean[n][m];
        int[] startPoint = new int[2];

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                char c = str.charAt(j);
                if(c == 'I') {
                    startPoint[0] = i;
                    startPoint[1] = j;
                }
                arr[i][j] = c;
            }
        }

        Queue<int[]> q = new LinkedList<>();
        q.add(startPoint);
        isVisted[startPoint[0]][startPoint[1]] = true;
        int answer = 0;

        while(!q.isEmpty()) {
            int[] point = q.poll();
            int r = point[0];
            int c = point[1];

            if(r + 1 < n && arr[r + 1][c] != 'X' && !isVisted[r + 1][c]) {
                if(arr[r + 1][c] == 'P') answer++;
                q.add(new int[]{r + 1, c});
                isVisted[r + 1][c] = true;
            }
            if(r - 1 >= 0 && arr[r - 1][c] != 'X' && !isVisted[r - 1][c]) {
                if(arr[r - 1][c] == 'P') answer++;
                q.add(new int[]{r - 1, c});
                isVisted[r - 1][c] = true;
            }
            if(c + 1 < m && arr[r][c + 1] != 'X' && !isVisted[r][c + 1]) {
                if(arr[r][c + 1] == 'P') answer++;
                q.add(new int[]{r, c + 1});
                isVisted[r][c + 1] = true;
            }
            if(c - 1 >= 0 && arr[r][c - 1] != 'X' && !isVisted[r][c - 1]) {
                if(arr[r][c - 1] == 'P') answer++;
                q.add(new int[]{r, c - 1});
                isVisted[r][c - 1] = true;
            }
        }
        bw.write(answer > 0 ? String.valueOf(answer) : "TT");
        bw.flush();
    }
}