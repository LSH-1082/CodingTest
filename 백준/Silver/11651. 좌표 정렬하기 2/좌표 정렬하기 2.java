import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

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

        Arrays.sort(coords, Comparator.comparing(Coord::getY).thenComparing(Coord::getX));
        for(Coord c : coords) {
            bw.write(c.getX() + " " + c.getY() + "\n");
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