import java.util.Scanner;
import java.util.Locale;

public class my {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.print((x / 100 >= 1 && x / 100 <= 9 && x % 5 == 0) ? "true" : "false");
    }
}
