import java.util.Scanner;

public class Gugudan {
    /* 2~ 9사이의 정수값 입력 후 단수 출력
    * for 사용하여 출력
    *
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dansu = sc.nextInt();

        for(int i=1; i<10; i++){
            int result = dansu * i;
            System.out.println(dansu + "*" + i +"=" + result);

        }
    }
}
