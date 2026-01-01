import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            switch (s[0]) {
                case "push":
                    q.offer(Integer.parseInt(s[1]));
                    break;
                case "pop":
                    if(q.isEmpty()) bw.write("-1\n");
                    else bw.write(q.poll() + "\n");
                    break;
                case "size":
                    bw.write(q.size() + "\n");
                    break;
                case "empty":
                    if(q.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if(q.isEmpty()) bw.write("-1\n");
                    else bw.write(q.peek() + "\n");
                    break;
                case "back":
                    if(q.isEmpty()) bw.write("-1\n");
                    else bw.write(((LinkedList<Integer>) q).peekLast() + "\n");
                    break;
            }
        }
        bw.flush();
    }
}
