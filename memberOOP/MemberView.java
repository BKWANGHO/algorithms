package memberOOP;

import java.util.Scanner;

public class MemberView {


        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.

            Scanner sc = new Scanner(System.in);
            Person ps = new Person();
            System.out.println("id를 입력해주세요");
            ps.setId(sc.next());

            System.out.println("비밀번호를 입력해주세요");
            ps.setPw(sc.next());

            System.out.println("비밀번호를 한번 더 입력해주세요");
            ps.setPwAgain(sc.next());

            System.out.println("이름를 입력해주세요");
            ps.setName(sc.next());

            System.out.println("주민번호를 입력해주세요");
            ps.setPersonId(sc.nextInt());

            System.out.println("전화번호를 입력해주세요");
            ps.setPhoneNumber(sc.nextInt());

            System.out.println("주소를 입력해주세요");
            ps.setAddress(sc.next());

            System.out.println("직업을 입력해주세요");
            ps.setJob(sc.next());


            System.out.println("ID : " + ps.getId());
            System.out.println("비 번 : " + ps.getPw());
            System.out.println("비번확인 : " + ps.getPwAgain());
            System.out.println("이 름 : " + ps.getName());
            System.out.println("주민번호 : " + ps.getpersonId());
            System.out.println("전화번호 : " + ps.getphoneNumber());
            System.out.println("주 소 : " + ps.getAddress());
            System.out.println("직업 : " + ps.getJob());

        }
    }



