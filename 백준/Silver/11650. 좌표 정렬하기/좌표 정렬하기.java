import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Coord> ls = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            String[] strs = br.readLine().split(" ");
            Coord c = new Coord(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]));
            ls.add(c);
        }
        ls.stream().sorted(Comparator.comparingInt(Coord::getX).thenComparingInt(Coord::getY)).forEach((o) -> {
            try {
                bw.write(o.getX() + " " + o.getY() + "\n");
            } catch (IOException e) {
            }
        });
        bw.flush();
    }
}

class Coord{
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

    private int x;
    private int y;
}