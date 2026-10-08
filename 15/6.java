import java.util.Scanner;
import java.util.Locale;

public class my {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.print((a % 2 == 0 && b % 2 == 0) || (a % 2 == 0 && c % 2 == 0) || (c % 2 == 0 && b % 2 == 0) ? "true" : "false");
    }
}
