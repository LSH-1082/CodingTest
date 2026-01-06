import java.io.*;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = (nums[2] - nums[1] - 1) / (nums[0] - nums[1]) + 1;

        bw.write(a + "");
        bw.flush();
    }
}