import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int x = Integer.parseInt(s.split(" ")[0]);
        int y = Integer.parseInt(s.split(" ")[1]);
        char[][] board = new char[x][y];

        int[] start = {0, 0};
        
        int answer = 1000000;
        int cnt = 0;

        for(int i = 0; i < x; i ++) {
            String tmp = br.readLine();
            for(int j = 0; j < tmp.length(); j++){
                board[i][j] = tmp.charAt(j);
            }
        }

        while(x - start[0] >= 8){
            while(y - start[1] >= 8) { 
                for(int i = start[0]; i < 8 + start[0]; i++){
                    for(int j = start[1]; j < 8 + start[1]; j++) {
                        if((i + j) % 2 == 1 && board[i][j] != 'W'){
                            cnt++;
                        }
                        else if((i + j) % 2 == 0 && board[i][j] != 'B'){
                            cnt++;
                        }
                    }
                }
                if(64 - cnt < cnt) cnt = 64 - cnt;
                if(answer > cnt) answer = cnt;
                cnt = 0;
                start[1]++;
            }
            start[1] = 0;
            start[0]++;
        }
        bw.write(answer+"");
        bw.flush();
    }
}
