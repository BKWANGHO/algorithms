import java.util.Scanner;

public class Honey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //        int n = (int)Math.random()*10;
//        int n = sc.nextInt();
        int honeyCase = 2;
        int bee1Sum = 0;
        int bee2Sum = 0;
        int honeysum =0;
//        int[] honey = new int[n];
        int[] honey = {9,9,4,1,4,9,9};
        int bee1 = 0;
        int bee2 = 6;
//        int[] bee2 = new int[n];

//        for (int i = 0; i < honey.length; i++) {
//            honey[i] = sc.nextInt();
//        }
//        int[] bee1 = new int[n];

//        for (int i=0;i<n;i++){

        if (bee1 < honeyCase) {
            for (int i=bee1+1; i < honeyCase+1; i++) {
            if(bee1 ==bee2){
            }else {
                bee1Sum += honey[i];
                }
            }



            System.out.println("1");
        } else if (bee1> honeyCase) {
            for (int i=bee1-1; i<honeyCase-1; i--){
                if(bee1==bee2){
                }else {
                bee1Sum += honey[i];
                }
            }
            System.out.println("2");
        }
//        }
        if (bee2 < honeyCase) {
            for (int i=bee2+1; i < honeyCase+1; i++) {
                if(i ==bee1){
                }else {
                    bee2Sum += honey[i];
                }
            }
            System.out.println("3");
        } else  {
            for (int i=bee2-1; i>honeyCase-1; i--){
                if(bee1==bee2){
                }else {
                    bee2Sum += honey[i];
                }
            }
            System.out.println("4");
        }
        honeysum = bee1Sum +bee2Sum;
        for (int i = 0; i < honey.length; i++) {
            System.out.print(honey[i]+" ");
        }
        System.out.println();
        System.out.println(bee1Sum + " + "+ bee2Sum + " = " +honeysum);

    }
}
