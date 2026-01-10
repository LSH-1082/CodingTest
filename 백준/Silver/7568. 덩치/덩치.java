import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Coord[] coords = new Coord[n];

        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            coords[i] = new Coord(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }

        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = 0; j < n; j++) {
                boolean isXBigger = coords[j].getX() > coords[i].getX();
                boolean isYBigger = coords[j].getY() > coords[i].getY();
                if(isXBigger && isYBigger) cnt++;
            }
            bw.write(cnt + " ");
        }
        bw.flush();
    }
}

class Coord{
    private int x;
    private int y;
    public Coord(int x, int y) {
        this.x = x;
        this.y = y; 
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
