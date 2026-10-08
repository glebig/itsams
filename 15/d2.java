import java.util.Scanner;
import java.util.Locale;

public class my {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.print((y < Math.sin(x)) && (y < 0.5) && (y >0) && (x< Math.PI) && (x > 0) ? "YES" : "NO");
    }
}
