import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> s = new HashSet<>();
        ArrayList<String> ls = new ArrayList<>();

        int notHeard = Integer.parseInt(st.nextToken());
        int notLooked = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < notHeard; i++) {
            s.add(br.readLine());
        }

        for(int i = 0; i < notLooked; i++) {
            String tmp = br.readLine();
            if(s.contains(tmp)) ls.add(tmp);
        }


        ls.sort(String::compareTo);
        bw.write(ls.size() + "\n");

        for(int i = 0; i < ls.size(); i++){
            bw.write(ls.get(i) + "\n");
        }

        bw.flush();
    }
}