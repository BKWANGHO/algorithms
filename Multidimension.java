import java.util.Scanner;

public class Multidimension {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("다음 시험에서 두개 반의 평균을 구하시오");

        int[] stNum = new int[2];
        for (int i = 0; i < stNum.length; i++) {
            System.out.println((i + 1) + " 반에서 시험에 응시한 학생수는 몇명입니까?");
            stNum[i] = sc.nextInt();
        }

        System.out.println("1반 학생수는 : " + stNum[0]);
        System.out.println("2반 학생수는 : " + stNum[1]);

//        System.out.println("입력된 점수 중에서 평균 점수를 구하시오");
//        int[] score = new int[stNum[0]];
//        int avg = 0;
//        int max = 0;
//        for (int i = 0; i < score.length; i++) {
//            System.out.printf((i+1) + "번 학생 점수: ");
//            score[i] = (int)(Math.random()*100);
//            avg += score[i];
//            System.out.println( score[i]);
//            if (max<score[i]){
//                max = score[i];
//            }
//        }
//            avg /= stNum[0];
//        System.out.printf("1반 평균 : %d, 1등 점수 : %d", avg, max);
//        System.out.println("");
//        int[] score2 = new int[stNum[1]];
//        int avg2 = 0;
//        int max1 =0;
//        for (int i = 0; i < score2.length; i++) {
//            System.out.print((i+1)+"번 점수: ");
//            score2[i] = (int)(Math.random()*100);
//            avg2 += score2[i];
//            System.out.println( score2[i]);
//            if (max1<score2[i]){
//                max1 = score2[i];
//            }
//        }
//        avg2 /= stNum[1];
//            averge(stNum[1]);
        System.out.printf("1반 평균 : %d", averge(stNum[0]));
        System.out.printf("2반 평균 : %d", averge(stNum[1]));
    }

    static int averge(int stNum) {
        int[] score2 = new int[stNum];
        int avg2 = 0;
        int max1 = 0;
        for (int i = 0; i < score2.length; i++) {
            System.out.printf((i + 1) + "번 점수: ");
            System.out.println("");
            score2[i] = (int) (Math.random() * 100);
            avg2 += score2[i];
            System.out.println(score2[i]);
            if (max1 < score2[i]) {
                max1 = score2[i];
            }
        }
        avg2 /= stNum;
        return avg2;
    }

}

