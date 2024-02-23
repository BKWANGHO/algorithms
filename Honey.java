import java.util.Scanner;

public class Honey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int location = sc.nextInt();
        int[] arr = {9, 9, 4, 1, 4, 9, 9};
        int bee2 = 0;
        int sumHoney = 0;
        int max1 = 0;
        int sum = 0;
        int max2 = 0;

        for (int i = 0; i < arr.length; i++) {
//            arr [i]= sc.nextInt();
            sumHoney += (arr[i] * 2);
        }

        for (int i = 0; i < arr.length; i++) {
            int bee1 = sumHoney - (arr[0]) - (arr[i] * 2);
            System.out.printf("bee1 : "+ bee1);
            if (max1 < bee1) {
                max1 = bee1;
                for (int j = 1; j < i; j++) {
                    sum += arr[j];
                }
                    System.out.println("sum : " + sum);
            }
        }
                    max1 -= sum;
        System.out.println();
        System.out.println("sumHoney" + max1);

    }
}

