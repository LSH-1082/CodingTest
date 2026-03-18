import java.io.*;
import java.util.stream.Stream;

public class Main {
    static int[][] paper;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        for(int i = 0; i < n; i++) {
            int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            paper[i] = nums; 
        }
        bw.write(solve(0, 0, n, 0) + "\n");
        bw.write(solve(0, 0, n, 1) + "");
        bw.flush();
    }

    public static boolean check(int r, int c, int size, int flag) {
        for(int i = r; i < size + r; i++) {
            for(int j = c; j < size + c; j++) {
			    if(paper[i][j] != flag) return false;
		    }
        }
        return true;
    }

    public static int solve(int r, int c, int size, int flag) {
        if(check(r, c, size, flag)) return 1;
        else if(size == 1) return 0;
        else {
            int nextSize = size / 2;
            return solve(r, c, nextSize, flag) + 
                    solve(r, c + nextSize, nextSize, flag) + 
                    solve(r + nextSize, c, nextSize, flag) + 
                    solve(r + nextSize, c + nextSize, nextSize, flag);
        }
    }	
}