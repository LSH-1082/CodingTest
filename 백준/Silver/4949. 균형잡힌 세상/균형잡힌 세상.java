import java.io.*;
import java.util.Stack;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> st = new Stack<>();

        while(true) {
            String n = br.readLine();
            if(n.equals(".")){
                break;
            } 

            for(char c : n.toCharArray()){
                if(c == '(' || c == '[') st.add(c);
                else if(st.isEmpty() && (c == ')' || c == ']')) {
                    st.add(c);
                    break;
                }
                else if(!st.isEmpty() && c == ')'){
                    if(st.peek() == '(') st.pop();
                    else break;
                }
                else if(!st.isEmpty() && c == ']'){
                    if(st.peek() == '[') st.pop();
                    else break;
                }
            }
            if(st.isEmpty()) bw.write("yes\n");
            else bw.write("no\n");
            st.clear();
        }
        bw.flush();
    }
}