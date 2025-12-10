import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		char[] c = br.readLine().toCharArray();
		int answer = 0;
		for(int i = 0; i < n; i++) {
		    answer += (int) ((c[i] - 'a') + 1) * Math.pow(31, i);
		}
		bw.write(answer + "");
		bw.flush();
	}
}
