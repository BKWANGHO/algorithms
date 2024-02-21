package memberOOP;

import java.util.Scanner;

public class MemberView {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("ID,비밀번호,비밀번호확인,이름,주민번호,전화번호,주소,직업을 입력해주세요");

            Member ps = new Member(sc.next(),sc.next(),sc.next(),sc.next(),
                    sc.nextInt(),sc.nextInt(),sc.next(),sc.next());

            System.out.println(ps.toString());
        }
    }