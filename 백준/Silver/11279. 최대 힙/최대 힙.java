import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                bw.write(q.isEmpty() ? "0\n" : q.poll() + "\n");
            }
            else {
                q.add(num);
            }
        }
        bw.flush();
    }
}