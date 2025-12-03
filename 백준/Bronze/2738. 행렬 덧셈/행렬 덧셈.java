import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = nums[0];
        int cols = nums[1];
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows * 2; i++) {
            int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0; j < cols; j++) {
                matrix[i % rows][j] += tmp[j];
                if(i >= rows) bw.write(matrix[i%rows][j] + " ");
            }
            if(i >= rows) bw.newLine();
        }
        bw.flush();
    }
}

