import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = 0;
        LinkedList<Integer> ls = new LinkedList<>();
        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine()) % 42;
            for(int j = 0; j < ls.size(); j++){
                if(ls.get(j) == n) c++;
            }
            if(c > 0) c = 0;
            else ls.add(n);
        }
        bw.write(ls.size() + "");
        bw.flush();
    }
}
