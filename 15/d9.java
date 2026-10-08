import java.util.Scanner;
import java.util.Locale;

public class My {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print((x*x + y*y < 1) || (y < 1 && x < 1 && x > 0 && y > 0) ? "YES" : "NO");
    }
}
