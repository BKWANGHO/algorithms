import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] height = new int[9];
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
            sum += height[i];
        }
        Arrays.sort(height);
        int result = 0;
        int num1 =0;
        int num2 =0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {

                result = sum - height[i] - height[j];

                if (result == 100) {
                    num1 =i;
                    num2 =j;
                }
            }
        }
        for(int i=0;i<height.length; i++){
            if(i == num1){
            } else if (i == num2) {
            }else {
                System.out.println(height[i]);
            }
        }

//        20 7 23 19 10 15 25 8 13
//        20 7 23 19 10 15 25 8 13
    }
}
