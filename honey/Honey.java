package honey;

import java.util.Scanner;

public class Honey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int location = sc.nextInt();
        int[] arr = new int[location];
        int sumHoney = 0;
        int max1 = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr [i]= sc.nextInt();
            sumHoney += (arr[i] * 2);
        }

        for (int i = 0; i < arr.length; i++) {
            int bee1 = sumHoney - (arr[0]) - (arr[i] * 2);
            if (max1 < bee1) {
                max1 = bee1;
                for (int j = 1; j < i; j++) {
                    sum += arr[j];
                }
            }
        }
        int compare1 = max1 - sum;
        max1=0;
        sum =0;
        for (int i = arr.length-1; i >= 0; i--) {
            int bee1 = sumHoney - (arr[arr.length-1]) - (arr[i] * 2);
            if (max1 < bee1) {
                max1 = bee1;
                for (int j = arr.length-2; j > 0; j--) {
                    sum += arr[j];
                }
            }
        }
        int compare2 = max1 - sum;
        max1=0;
        sum=0;

        int a= 0;
        for(int i=1; i<arr.length-1;i++){
        sum+=arr[i];
        a= sum;
        }
        for (int i = 1; i < arr.length-1; i++) {
            int bee1 = sum - arr[i];
            if (max1 < bee1) {
                max1 = bee1;
                }
            sum=a;
        }
        int compare3 =max1;
        int max =0;
        if(compare1<compare2){
            if(compare3<compare2){
                max=compare2;
            }else {
                max=compare3;
            }
        }else {
            if(compare1>compare3){
                max=compare1;
            }else {
                max=compare3;
            }
        }
        System.out.println();
        System.out.println(max);

    }
}

