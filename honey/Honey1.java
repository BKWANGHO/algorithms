package honey;

import java.util.Scanner;

public class Honey1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int total = sc.nextInt();
            int[] arr = new int[total];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int max = 0;
            for (int i = 2; i < arr.length; i++) {
                sum += arr[i]*2;
            }
            if (max < sum) {
                max = sum;
            }
            for (int i = 2; i <arr.length-1; i++) {
                sum = sum - arr[i]*2 + arr[i - 1];
                if (max < sum) {
                    max = sum;
                }
            }
            sum = 0;
            for (int i = arr.length - 3; i >= 0; i--) {
                sum += arr[i];
            }
            if (max < sum) {
                max = sum;
            }
            for (int i = arr.length-3; i >= 1; i--) {

                sum = sum - arr[i] * 2 + arr[i + 1];
                if (max < sum) {
                    max = sum;
                }
            }
            sum = 0;
            int a=0;
            for (int i = 1; i < arr.length - 1; i++) {
                sum += arr[i];
                a=sum;
            }
            for (int i = 1; i < arr.length - 1; i++) {
                sum += arr[i];
                if (max < sum) {
                    max = sum;
                }
                sum=a;

            }
            System.out.println(max);
        }
    }

