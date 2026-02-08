import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String arr[] = new String[n + 1];

        for(int i = 1; i <= n; i++) {
            String str = br.readLine();
            arr[i] = str;
            hm.put(str, i);
        }

        for(int i = 0; i < m; i++) {
            boolean isDigit = true;
            String str = br.readLine();
            for(char c : str.toCharArray()) {
                if(!Character.isDigit(c)){
                    isDigit = false;
                    break;
                }
            }

            if(isDigit) {
                int num = Integer.parseInt(str);
                bw.write(arr[num] + "\n");
            }
            else {
                bw.write(hm.get(str) + "\n");
            }
        }
        bw.flush();
    }
}