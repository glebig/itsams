import java.util.Scanner;
import java.util.Locale;

public class my {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        System.out.print(((x >= -3 && x <= 5) || (x >= 9 && x <= 15)) ? "true" : "false");
    }
}
