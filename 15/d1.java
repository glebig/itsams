import java.util.Scanner;
import java.util.Locale;

public class my {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print((x*x + y *y > 4) && (x > y) && (x < 2) && (y >0) ? "YES" : "NO");
    }
}
