import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("첫번째 숫자를 입력하세요 : ");
        String num1 = sc.next();

        System.out.printf("두번째 숫자를 입력하세요 : ");
        String num2 = sc.next();
        System.out.printf("+,-,*,/ 을 입력하세요 : ");
        String opcode = sc.next();

        int result = 0;
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);

        if (opcode.equals("+")) {
            result = intNum1 + intNum2;
        } else if (opcode.equals("-")) {
            result = intNum1 - intNum2;
        } else if (opcode.equals("*")) {
            result = intNum1 * intNum2;
        } else if (opcode.equals("/")) {
            if (intNum2 != 0) {
                result = intNum1 / intNum2;
            } else {
                System.out.println("0으로는 못나눕니다.");
            }
        } else {
            System.out.println("잘못된 연산 기호입니다. ");
        }

        System.out.println("첫번째 숫자 : " + intNum1 + ", 두번째 숫자 : " + intNum2);
        System.out.println("연산결과 : " + result);

    }
}
