import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int num = 0;
    static final ArrayList<Integer[]> list = new ArrayList<>();
    static int n = 0;
    static int r = 0;
    static int c = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, n);

        list.add(new Integer[]{0, 0});
        list.add(new Integer[]{0, 1});
        list.add(new Integer[]{1, 0});
        list.add(new Integer[]{1, 1});

        int answer = func(0, 0, size);
        bw.write(answer + "");
        bw.flush();
    }

    public static int func(int start, int end, int size) {
        if(size == 2) {
            int answer = 0;
            for(int i = 0; i < 4; i++) {
                if(start + list.get(i)[0] == r && end + list.get(i)[1] == c) answer = num;
                else num++;
            }
            return answer;
        }
        else {
            if(start + (size / 2) > r) {
                if(end + (size / 2) > c) {
                    return func(start, end, size / 2);
                }
                else {
                    num += size * size / 4;
                    return func(start, end + size / 2, size / 2);
                }
            }
            else {
                if(end + (size / 2) > c) {
                    num += (size * size / 4) * 2;
                    return func(start + size / 2, end, size / 2);
                }
                else {
                    num += (size * size / 4) * 3;
                    return func(start + size / 2, end + size / 2, size / 2);
                }
            }
        }
    }
}