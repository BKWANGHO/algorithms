package honey;

import java.util.Scanner;

public class Honey1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            int[] arr = new int[c];
            int a = 0;
            int sum = 0;
            int max = 0;
            for(int i = 0; i<arr.length; i++){
                arr[i]=sc.nextInt();
                sum += (arr[i]*2);
                a=sum;
            }
            sum =sum- (arr[0] * 2) - (arr[1] * 2);
                max = sum;
            for(int i=2; i<arr.length-1; i++) {
                sum = sum - (arr[i] * 2) + arr[i - 1];
                if (max < sum) {
                    max = sum;
                }
            }
            sum=a;
            sum = sum-(arr[arr.length-1]*2)-(arr[arr.length-2]*2);
            if(max<sum){
                max=sum;
            }
            for(int i= arr.length-3; i>0; i--) {
                sum =sum- (arr[i] * 2) + arr[i + 1];
                if (max < sum) {
                    max = sum;
                }
            }
            for(int i=1; i<arr.length-1; i++){
                sum=a/2-arr[0]-arr[arr.length-1];
                sum=sum+arr[i];
                if(max<sum){
                    max=sum;
                }
            }
            System.out.println(max);
        }
    }

