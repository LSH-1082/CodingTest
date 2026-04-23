import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<int[]> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] time = new int[2];
            time[0] = Integer.parseInt(st.nextToken());
            time[1] = Integer.parseInt(st.nextToken());
            list.add(time);
        }

        list.sort(Comparator.comparingInt((int[] o) -> o[0]).thenComparingInt(o -> o[1]));
        

        int answer = 0;
        int preStartTime = 0;
        int preEndTime = 0;

        for(int i = 0; i < list.size(); i++) {
            int startTime = list.get(i)[0];
            int endTime = list.get(i)[1];

            if(startTime < preEndTime) {
                if(preEndTime - preStartTime > endTime - preStartTime) {
                    preEndTime = endTime; 
                }
            }
            else {
                answer++;
                preStartTime = startTime;
                preEndTime = endTime;
            }
        }
        bw.write(answer + "");
        bw.flush();
    }
}