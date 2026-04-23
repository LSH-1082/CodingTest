import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[] isVisitied = new boolean[100001];

        if(n == k) {
            bw.write("0");
            bw.flush();
            return;
        }
        
        q.add(n);
        isVisitied[n] = true;
        int answer = 0;

        ArrayList<Custom> list = new ArrayList<>();
        list.add((num) -> num * 2);
        list.add((num) -> num + 1);
        list.add((num) -> num - 1);

        while(!q.isEmpty()) {
            int size = q.size();
            answer++;
            for(int i = 0; i < size; i++) {
                int num = q.poll();
                for(int j = 0; j < 3; j++) {                    
                    int next = list.get(j).func(num);
                    if(next == k) {
                        bw.write(answer + "");
                        bw.flush();
                        return;
                    }

                    if(next >= 0 && next <= 100000 && !isVisitied[next]) {
                        isVisitied[next] = true;
                        q.add(next);
                    }
                }
            }
        }
    }

    @FunctionalInterface
    interface Custom {
        int func(int num);
    }
}