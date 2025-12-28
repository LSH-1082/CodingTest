import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>(Stream.of(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        
        int n2 = Integer.parseInt(br.readLine());
        int[] ls2 = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int n : ls2){
            if(set.contains(n)) bw.write("1\n");
            else bw.write("0\n");
        }
        bw.flush();
    }
}