import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        ArrayList<Boolean> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(i == p1 - 1 || i == p2 - 1) arr.add(true);
            else arr.add(false);
        }

        int cnt = 0;
        boolean flag = false;
        ArrayList<Boolean> tmp = new ArrayList<>();
        while (arr.size() > 1 && !flag) {
            cnt++;
            int size = arr.size() % 2 != 0 ? arr.size() - 1 : arr.size();
            for(int i = 0; i < size; i += 2) {
                boolean bool = arr.get(i) || arr.get(i + 1);

                flag = arr.get(i) && arr.get(i + 1);

                if(flag) break;
                tmp.add(bool);
            }

            if(arr.size() % 2 != 0) tmp.add(arr.get(arr.size() - 1));

            arr = new ArrayList<>(tmp);
            tmp.clear();
        }
        bw.write(cnt + "\n");
        bw.flush();
    }
}