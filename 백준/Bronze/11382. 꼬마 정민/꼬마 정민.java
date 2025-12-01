import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.valueOf(st.nextToken());
        double b = Double.valueOf(st.nextToken());
        double c = Double.valueOf(st.nextToken());

        System.out.println(String.format("%.0f", a + b + c));
    }
}