import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		char[] c = br.readLine().toCharArray();
		long answer = 0;
        long pow = 1;
        int mod = 1234567891;
		for(int i = 0; i < n; i++) {
            answer = (answer + (c[i] - 'a' + 1) * pow) % mod;
            pow = pow * 31 % mod;
		}
        bw.write(answer + "");
		bw.flush();
	}
}
