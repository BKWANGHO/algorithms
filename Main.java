import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("ID : " );
        String id = sc.next();

        System.out.printf("비 번 : ");
        String password = sc.next();

        System.out.printf("비번확인 : ");
        String passwordCheck = sc.next();

        System.out.printf("이름 : ");
        String name = sc.next();

        System.out.printf("주민번호 : ");
        String identityNumber = sc.next();

        System.out.printf("전화번호 : ");
        String phoneNumber = sc.next();

        sc.nextLine();
        System.out.printf("주소 : ");
        String address = sc.nextLine();

        System.out.printf("직업 : ");
        String job = sc.next();

        System.out.println("ID : " + id );
        System.out.println("비번 : " + password );
        System.out.println("비번확인 : " + passwordCheck );
        System.out.println("이름 : " + name );
        System.out.println("주민번호 : " + identityNumber );
        System.out.println("전화번호 : " + phoneNumber );
        System.out.println("주소 : " + address );
        System.out.println("직업 : " + job );
    }
}