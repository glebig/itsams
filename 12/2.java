import java.util.Scanner;

public class my {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s = a%10 + (a / 10) % 10 + a / 100;
        System.out.println(s);
    }
}
