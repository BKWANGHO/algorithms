package kaupOOP;

import memberOOP.Member;

import java.util.Scanner;
public class KaupView {

    static String test;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member person = new Member(180.5,80.1);

        KaupService service = new KaupServiceImpl();

        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();

        System.out.println("이름 : " + person.getName());
        System.out.printf("키 : %.1fM, 몸무게 : %.1fkg, ", person.getHeight(), person.getWeight());
        System.out.printf("BMI : %.1f",bmi);
        System.out.println(" " + bodyMass+ "입니다.");
    }
}