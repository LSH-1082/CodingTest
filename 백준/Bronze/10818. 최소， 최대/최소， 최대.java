import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int max = -1000000;
        int min = 10000000;
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int a : num){
            if(a > max) max = a;
            if(a < min) min = a;
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}
