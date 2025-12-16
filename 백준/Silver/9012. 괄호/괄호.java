import java.io.*;
import java.util.Stack;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(char c : s.toCharArray()){
                if(c == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
                else stack.push(c);
            }
            if(stack.isEmpty()) bw.write("YES\n");
            else bw.write("NO\n");
            stack.clear();
        }
        bw.flush();
    }
}
