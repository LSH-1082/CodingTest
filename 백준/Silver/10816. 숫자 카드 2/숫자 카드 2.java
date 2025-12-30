import java.io.*;
import java.util.HashMap;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        
        Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(i -> hm.put(i, hm.getOrDefault(i, 0) + 1));;

        int n2 = Integer.parseInt(br.readLine());

        int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int num : nums){
            bw.write(hm.getOrDefault(num, 0) + " ");
        }

        bw.flush();
    }
}