import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = new String[3];
        str[0] = br.readLine();
        str[1] = br.readLine();
        str[2] = br.readLine();

        int num = 0;
        for(int i = 0; i < 3; i++){
            int n = str[i].charAt(0) - '0';
            if(n > 0 && n < 10) num = Integer.parseInt(str[i]) + 3 - i;
        }

        if(num % 3 == 0 && num % 5 ==0) bw.write("FizzBuzz");
        else if(num % 3 == 0) bw.write("Fizz");
        else if(num % 5 ==0) bw.write("Buzz");
        else bw.write(num + "");

        bw.flush();
    }
}