import java.io.*;
import java.util.Stack;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            String[] argString = br.readLine().split(" ");
            switch(argString[0]){
                case "push":
                    stack.push(argString[1]);
                    break;
                case "top":
                    if(!stack.isEmpty()) bw.write(stack.peek() + "\n");
                    else bw.write("-1\n");
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    if(!stack.isEmpty()) bw.write("0\n");
                    else bw.write("1\n");
                    break;
                case "pop":
                    if(!stack.isEmpty()) bw.write(stack.pop() + "\n");
                    else bw.write("-1\n");
                    break;
            }
        }
        bw.flush();
    }
}
