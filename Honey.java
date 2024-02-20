import java.util.Scanner;

public class Honey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //        int n = (int)Math.random()*10;
        int n = sc.nextInt();
        int honeyCase = 2;
        int bee1Sum = 0;
        int bee2Sum = 0;
        int honeysum =0;
        int[] honey = new int[n];
//        int bee1 = 0;
//        int bee2 = 5;

        for (int i = 0; i < honey.length; i++) {
            honey[i] = sc.nextInt();
        }
        int[] bee1 = new int[n];
        int[] bee2 = new int[n];
        int b1 = 0;
        int b2 = 0;
        for (int i=0;i<n;i++){
        if (i < honeyCase) {
            for (int j=i+1; j < honeyCase+1; j++) {
                i=b1;
            if(i ==b2){
            }else {
                bee1Sum += honey[i];
                }
            }
        } else if (i> honeyCase) {
            for (int j=i-1; j<honeyCase-1; j--){
                if(i==b2){
                }else {
                bee1Sum += honey[i];
                }
            }
        }
        }
        for (int i=0;i<n;i++) {
            if ( i<honeyCase){
                for (int j = i+1; j < honeyCase + 1; j++) {
                    if (i == b1) {
                    } else {
                        bee2Sum += honey[i];
                    }
                }
            } else{
                for (int j = i-1; j > honeyCase - 1; j--) {
                    if (j == b1) {
                    } else {
                        bee2Sum += honey[i];
                    }
                }
            }
        }
        honeysum = bee1Sum +bee2Sum;
        System.out.println(bee1Sum + " + "+ bee2Sum + " = " +honeysum);

    }
}
