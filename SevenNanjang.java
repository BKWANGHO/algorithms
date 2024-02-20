import java.util.Scanner;

public class SevenNanjang {
    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum =0;

        for(int i=0; i<arr.length;i++){
            arr[i] =sc.nextInt();
            sum += arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] =swap;
                }
            }
        }

        int num1 =0;
        int num2 =0;
        int re = 0;
        for(int i =0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                re = sum -arr[i]-arr[j];
                if(re ==100){
                    num1 =i;
                    num2 =j;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(num1==i){
            }else if(num2 ==i){
            }else{
                System.out.println(arr[i]);
            }
        }
    }
}
//Scanner sc = new Scanner(System.in);

//        20 7 23 19 10 15 25 8 13



