import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();

        int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = 1;

        for(int i = 1; i <= nums[0]; i++) {
            q.offer(i);
        }
        bw.write("<");
        while(!q.isEmpty()) {
            if (cnt % nums[1] == 0){
                bw.write(q.poll() + "");
                if(!q.isEmpty()) bw.write(", ");
            }
            else q.offer(q.poll());
            cnt++;
        }
        bw.write(">");
        bw.flush();
    }
}
