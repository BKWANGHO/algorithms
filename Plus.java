    import java.util.Scanner;
    public class Plus {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("테스트 케이스를 입력하세요 : ");
            int testCase = sc.nextInt();

            for(int i= 0; i <testCase; i++){
                System.out.printf("두개의 정수를 입력하세요 : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int result = num1 +num2;

                System.out.println(num1 + " + " + num2 + " = " + result);

            }
        }
    }

