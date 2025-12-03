import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        for(String a : nums){
            if(Integer.parseInt(a) == v) count++;
        }
        bw.write(count + "");
        bw.flush();
    }
}