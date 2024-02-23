import java.util.Scanner;

public class LongBIte {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = n/4;
        if (n%4==0) {
            for(int i=0;i<num1; i++){
                System.out.printf("long ");
            }
            System.out.println("int");

        }

    }
}
