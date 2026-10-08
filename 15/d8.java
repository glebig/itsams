import java.util.Scanner;
import java.util.Locale;

public class my {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print((y < 1) && (x > 0) && ( x*x + y*y < 1 || y > x- 1) ? "YES" : "NO");
    }
}
