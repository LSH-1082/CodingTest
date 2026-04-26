import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int code = Integer.parseInt(st.nextToken());

            switch (code) {
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stack.add(num);
                    break;

                case 2:
                    bw.write(stack.isEmpty() ? "-1" : String.valueOf(stack.pop()));
                    bw.newLine();
                    break;
                
                case 3:
                    bw.write(stack.size() + "");
                    bw.newLine();
                    break;

                case 4:
                    bw.write(stack.isEmpty() ? "1" : "0");
                    bw.newLine();
                    break;

                case 5:
                    bw.write(stack.isEmpty() ? "-1" : stack.peek() + "");
                    bw.newLine();
                    break;
            }
        }

        bw.flush();
    }
}

