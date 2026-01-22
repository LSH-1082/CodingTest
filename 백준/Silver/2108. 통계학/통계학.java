import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            total += num;
            nums[i] = num;
        }

        Map.Entry[] rank = hm.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.<Integer, Integer>comparingByKey())).toArray(Map.Entry[]::new);

        Arrays.sort(nums);
        bw.write(Math.round((float)total/n) + "\n");
        bw.write(nums[n / 2] + "\n");
        bw.write((rank.length > 1&& rank[0].getValue() == rank[1].getValue() ? rank[1].getKey() : rank[0].getKey()) + "\n");
        bw.write(nums[nums.length - 1] - nums[0] + "\n");
        bw.flush();
    }
}