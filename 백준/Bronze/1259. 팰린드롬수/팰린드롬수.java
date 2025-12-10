import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true){
		    boolean isPalindrome = true;
		    String n = br.readLine();
		    if(n.equals("0")) break;
		    char[] num = n.toCharArray();
		    for(int i = 0; i < num.length / 2; i++) {
		        if(num[i] != num[num.length - 1 - i]) isPalindrome = false;
		    }
		    bw.write(isPalindrome ? "yes\n" : "no\n");
		    bw.flush();
		}
	}
}
