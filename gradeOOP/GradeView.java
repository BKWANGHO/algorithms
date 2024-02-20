package gradeOOP;
import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Student bb = new Student();
                System.out.println("다음은 한 학생의 과목 점수이다.");
                System.out.printf("이름 : ");
                bb.setName(sc.next());
                System.out.printf("국어점수 : ");
                bb.createKorean();
                System.out.printf("영어점수 : ");
                bb.createEnglish();
                System.out.printf("수학점수 : ");
                bb.createMath();
                System.out.println("평균 점수를 구하시오");
                bb.createAverage();

                System.out.println(" ============= 성적표 ==============");
                System.out.println("이름 : " + bb.getName());
                System.out.println("국어점수 : " + bb.getKorean());
                System.out.println("영어점수 : " + bb.getEnglish());
                System.out.println("수학점수 : " + bb.getMath());
                System.out.println("평균 점수: " + bb.getAverage());

            }
        }

