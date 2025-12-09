import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = 0;
        for(int num : nums){
            int tmp = 0;
            if(num == 1) continue;
            for(int j = 2; j <= Math.sqrt(num); j++){
                if(num % j == 0) tmp++;
            }
            if(tmp == 0) cnt++;
        }
        bw.write(cnt + "");
        bw.flush();
    }
}
