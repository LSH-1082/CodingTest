import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean[] set = new boolean[21];

        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            String cmd = str[0];
            int num;
            switch (str[0]) {
                case "add":
                    num = Integer.parseInt(str[1]);
                    set[num] = true;
                    break;
                case "remove":
                    num = Integer.parseInt(str[1]);
                    set[num] = false;
                    break;
                case "check":
                    num = Integer.parseInt(str[1]);
                    if(set[num]) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(str[1]);
                    set[num] = !set[num];
                    break;
                case "all":
                    for(int j = 1; j < 21; j++) {set[j] = true;}
                    break;
                case "empty":
                    for(int j = 1; j < 21; j++) {set[j] = false;}
                    break;
            }
        }
        bw.flush();
    }
}