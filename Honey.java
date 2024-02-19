import java.util.Scanner;

public class Honey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //        int n = (int)Math.random()*10;
        int n = sc.nextInt();
        int bee1 = 0;
        int bee2 = 1;
        int honeyCase = 6;
        int bee1Sum = 0;
        int bee2Sum = 0;
        int[] honey = new int[n];
        for (int i = 0; i < honey.length; i++) {
            honey[i] = sc.nextInt();
        }
        if (bee1 < honeyCase) {
            for (int i=bee1+1; i < honeyCase+1; i++) {
            if(i ==bee2){
            }else {

                bee1Sum += honey[i];
                System.out.println( i+" "+honey[i]);
                }
            }

                System.out.println("1: " + bee1Sum);
        } else if (bee1> honeyCase) {
            for (int i=bee1-1; i<honeyCase-1; i--){
                if(bee1==bee2){
                }else {
                bee1Sum += honey[i];
                }
            }
                System.out.println("2: " + bee1Sum);
        }

    }
}
