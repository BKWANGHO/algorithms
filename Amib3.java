import java.util.Scanner;

public class Amib3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        int[] arr = new int[testCase];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
