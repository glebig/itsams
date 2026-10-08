import java.util.Scanner;
import java.util.Locale;

public class my {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        System.out.print(((x >= -2 && x <= 3) || (x >= 6 && x <= 9)) ? "false" : "true");
    }
}
