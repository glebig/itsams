import java.util.Scanner;
import java.util.Locale;

public class my {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.print(a * -1 == b || a* -1 == c || a *-1 == d || b *-1 == c || b * -1 == d || c *-1 == d ? "true" : "false");
    }
}
