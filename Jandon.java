import java.util.Scanner;

public class Jandon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        int changeMoney = 1000 - price;
        int paperMoney = 0;
        int arr[] = {500, 100, 50, 10, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            if (changeMoney / arr[i] != 0) {
                int temp = changeMoney / arr[i];
                changeMoney -= (arr[i] * temp);
                paperMoney += temp;
            }
        }
        System.out.println(paperMoney);
    }
}

