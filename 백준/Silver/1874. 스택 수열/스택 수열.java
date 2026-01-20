import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            st.push(i);
            sb.append("+\n");
            for(int j = cnt; j < n; j++){
                if(!st.isEmpty() && st.peek() == nums[j]){
                    st.pop();
                    sb.append("-\n");
                    cnt++;
                }
                else break;
            }
        }
        if(st.isEmpty()) bw.write(sb.toString());
        else bw.write("NO");
        bw.flush();
    }
}