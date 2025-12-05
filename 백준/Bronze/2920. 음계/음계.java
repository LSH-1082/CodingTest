import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int asc = 0;
        int desc = 0;
        for(int i = 0; i < 7; i++) {
            if(nums[0] < nums[1])
                if(nums[i + 1] - nums[i] == 1) asc++;
            if(nums[0] > nums[1])
                if(nums[i] - nums[i + 1] == 1) desc++;
        }
        if(Math.abs(asc - desc) != 7) bw.write("mixed");
        else if(asc == 7) bw.write("ascending");
        else if(desc == 7) bw.write("descending");
        bw.flush();
    }
}
