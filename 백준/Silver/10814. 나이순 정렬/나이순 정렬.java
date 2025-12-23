import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Member> ls =  new ArrayList<Member>();
        for(int i = 0; i < n; i++) {
            String[] argString = br.readLine().split(" ");
            Member m = new Member(Integer.parseInt(argString[0]), argString[1]);
            ls.add(m);
        }
        ls.stream().sorted(Comparator.comparingInt(m -> m.age)).forEach((o) -> {
            try{
                bw.write(o.age + " " + o.name + "\n");
            }catch(IOException e){}
        });
        bw.flush();
    }
}

class Member {
    int age;
    String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}