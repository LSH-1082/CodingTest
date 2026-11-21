import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 1; i <= arr[0]; i++) {
            for(int j = 1; j <= arr[1]; j++) {
                for(int k = 1; k <= arr[2]; k++) {
                    int total = i + j + k;
                    map.put(total, map.getOrDefault(total, 0) + 1);
                }
            }
        }

        int max[] = {0, 0};
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max[1] < entry.getValue()) {
                max[0] = entry.getKey();
                max[1] = entry.getValue();
            }
        }

        bw.write(max[0] + "");
        bw.flush();
    }
}
