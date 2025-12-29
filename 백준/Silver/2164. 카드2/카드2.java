import java.io.*;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> ls = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            ls.add(i);
        }
        while(ls.size() != 1){
            ls.pop();
            ls.addLast(ls.pollFirst());
        }
        bw.write(ls.pop()+"");
        bw.flush();
    }
}