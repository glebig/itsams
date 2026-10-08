import java.util.Scanner;

public class my {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.print((x >= 3 && x <= 8) ? "true" : "false");
    }
}
