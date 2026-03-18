import java.io.*;
import java.util.stream.Stream;

public class Main {
    static int[][] paper;
    static int bCount = 0;
    static int wCount = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        for(int i = 0; i < n; i++) {
            int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            paper[i] = nums; 
        }

        solve(0, 0, n);
        bw.write(wCount + "\n");
        bw.write(bCount + "");
        bw.flush();
    }

    public static boolean check(int r, int c, int size) {
        int n = paper[r][c];
        for(int i = r; i < size + r; i++) {
            for(int j = c; j < size + c; j++) {
			    if(paper[i][j] != n) return false;
		    }
        }
        if(n == 0) wCount++;
        if(n == 1) bCount++;
        return true;
    }

    public static void solve(int r, int c, int size) {
        if(!check(r, c, size)) {
            int nextSize = size / 2;
            solve(r, c, nextSize);
            solve(r, c + nextSize, nextSize);
            solve(r + nextSize, c, nextSize);
            solve(r + nextSize, c + nextSize, nextSize);
        }
    }	
}