import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        TreeMap<Integer, Integer> tmap = new TreeMap<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int cnt = Integer.parseInt(br.readLine());

            for(int j = 0; j < cnt; j++) {
                st = new StringTokenizer(br.readLine());
                String code = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                switch (code) {
                    case "I":
                        tmap.put(num, tmap.getOrDefault(num, 0) + 1);
                        break;
                    case "D":
                        if(!tmap.isEmpty()) {
                            int key = num == 1 ? tmap.lastEntry().getKey() : tmap.firstEntry().getKey();
                            int value = tmap.get(key);
                            if(value > 1) {
                                tmap.put(key, value - 1);
                            }
                            else {
                                tmap.remove(key);
                            }
                        }
                        break;
                }
            }
            String msg = tmap.isEmpty() ? "EMPTY" : tmap.lastEntry().getKey() + " " + tmap.firstEntry().getKey();
            bw.write(msg);
            bw.newLine();
            tmap.clear();
        }
        bw.flush();
        
    }
}