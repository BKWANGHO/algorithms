import java.util.Scanner;

public class ArrayTest2 {
    /* 최적화 문제 중 최대값 구하기
     * 시험에 응시한 학생 수 구하기
     *  */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오");
        System.out.println("시험에 응시한 학생수는 몇명입니까?");
        int stNum = sc.nextInt();
        String[] names = new String[stNum];
        int[] score = new int[stNum];
        System.out.println("학생수는 : " + stNum);

        System.out.println("입력된 점수 중에서 1등 점수를 구하시오");
        int max = 0;
        String bestSt = "";
        for (int i = 0; i < score.length; i++) {
            System.out.printf("응시한 학생의 이름을 입력하세요 : ");
            names[i] = sc.next();
            System.out.printf("점수 입력: ");
            String num = sc.next();
            score[i] = Integer.parseInt(num);
            if (max < score[i]) {
                max = score[i];
                bestSt = names[i];
            } else {
            }
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println("학생 이름 : " + names[i] + ", 점수 : " + score[i]);
        }

        System.out.println("학생 이름은 : " + bestSt + ", 1등 점수는 : " + max);

//        int max = 0);
    }
}
