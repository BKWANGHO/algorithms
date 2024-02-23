import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int totalPrice =sc.nextInt();
        int totalType = sc.nextInt();

        int sum = 0;
        for(int i=0;i<totalType;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += a*b;
        }
        if(sum==totalPrice){
        System.out.println("Yes");
        }else {
            System.out.println("No");
        }




    }
}
