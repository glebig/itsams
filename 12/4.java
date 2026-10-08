import java.util.Scanner;

public class my {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int s = a * c + (b*c) / 100;
        int k = (b*c) % 100;
        System.out.print(s + " " + k);
    }
}
