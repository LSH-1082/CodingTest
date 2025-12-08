import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            int[] rect = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            if(rect[0] == 0 && rect[1] == 0 && rect[2] == 0) break;
            if(rect[0] * rect[0] + rect[1] * rect[1] == rect[2] * rect[2]) bw.write("right");
            else bw.write("wrong");
            bw.newLine();
        }
        bw.flush();
    }
}
