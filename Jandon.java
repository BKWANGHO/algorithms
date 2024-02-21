import java.util.Scanner;

public class Jandon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        int jandon = 1000 - price;
        int a = 0;
        int ji = 0;
        int arr[] = {500, 100, 50, 10, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < 10; j++) {
                if (jandon / arr[i] != 0) {
                    a = jandon / arr[i];
                    jandon -= (arr[i] * a);
                    ji += a;
                }
            }
        }
            System.out.println("지폐 수는 : " + ji);
    }
}

