import java.util.Scanner;

public class my {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s = (a / 3600);
        a -= s*3600;
        int k = a / 60;
        a -= k*60;
        int c = a % 60;
        s = s % 24;
        System.out.print(s + ":" + k/10 + "" + k%10 + ":" + c/10 +"" + c%10);
    }
}
