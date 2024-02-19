import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b - 45 < 0) {
            if (a == 0) {
                a = +24;
            }
            System.out.print((a-1) + " " + (b + 15));
        } else {
            System.out.print(a + " " + (b - 45));

        }
    }
}
