package kaupOOP;

import java.util.Scanner;
public class KaupView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person bae = new Person();
        System.out.println("이름을 입력하세요");
        bae.setName(sc.next());

        bae.createBmi();
        bae.createBodyMass();

        System.out.println("이름 : " + bae.getName());
        System.out.printf("키 : %.1fM, 몸무게 : %.1fkg, ", bae.getHeight(), bae.getWeight());
        System.out.printf("BMI : %.1f",bae.getBmi());
        System.out.println(" " + bae.getBodyMass()+ "입니다.");

    }
}