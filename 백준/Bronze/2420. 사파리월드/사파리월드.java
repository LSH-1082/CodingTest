import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = Double.valueOf(sc.next());
        double b = Double.valueOf(sc.next());
        System.out.printf("%.0f", Math.abs(a - b));
    }
}