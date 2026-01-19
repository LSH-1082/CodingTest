import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Obj> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int[] arrs = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] weightsArrs = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0; j < weightsArrs.length; j++) {
                if(arrs[1] == j) q.offer(new Obj(weightsArrs[j], true));
                else q.offer(new Obj(weightsArrs[j], false));
            }
            Arrays.sort(weightsArrs);
            int cnt = 0;
            while(!q.isEmpty()) {
                if(q.peek().getWeight() == weightsArrs[q.size() - 1]) {
                    if(q.peek().getBool()){
                        bw.write((cnt + 1) +  "\n");
                        cnt = 0;
                        q.clear();
                        break;
                    }
                    else {
                        q.poll();
                        cnt++;
                    }
                }
                else q.offer(q.poll());
            }
        }
        bw.flush();
    }
}

class Obj {
    private int weight;
    private boolean bool;
    Obj(int weight, boolean bool) {
        this.weight = weight;
        this.bool = bool;
    }

    public int getWeight() {
        return this.weight;
    }
    public boolean getBool() {
        return this.bool;
    }
}