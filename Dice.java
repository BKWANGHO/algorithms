import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];
        int reward = 0;
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (max < num[i]){
                max = num[i];
            }
        }

            if (num[0] == num[1]) {
                if(num[0] == num[2]){
                    reward = 10000 + num[1] * 1000;
                }else{
                    reward = 1000 + num[0]* 100;
                }
            }else {
                if(num[1] == num[2]){
                    reward = 1000 + num[1] * 100;
                }else if (num[0] != num[2]){
                    reward =  max* 100;
                } else {
                    reward = 1000 + num[0] * 100;
                }
            }

        System.out.println(reward);
//        System.out.println(same);
//        System.out.println(sameNumber);
    }
}
