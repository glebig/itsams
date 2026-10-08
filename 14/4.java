import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = in.nextInt();
        int a = (1 << i);
        System.out.print((int)(n^a));
    }
}
