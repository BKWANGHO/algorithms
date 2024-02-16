import java.util.Scanner;
public class ArrayTest2 {
    /* 최적화 문제 중 최대값 구하기
     * 시험에 응시한 학생 수 구하기 
     *  */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오");
        System.out.println("시험에 응시한 학생수는 몇명입니까?");
        int stNum =sc.nextInt();
        String[] names = new String[stNum];
        int[] score = new int[stNum];

        for (int i=0; i< names.length; i++){
            System.out.println("응시한 학생의 이름을 입력하세요");
            names[i] = sc.next();
        }

        System.out.println("입력된 점수 중에서 1등 점수를 구하시오");
        int max =0;
        int matching = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.println("점수 입력: ");
            String num = sc.next();
            score[i] = Integer.parseInt(num);
            if(max < score[i]){
                max = score[i];
                matching = i;
            }else {
            }
        }
        System.out.println("학생수는 : " + stNum);
        System.out.println("1등 점수는 : " + max + ", 학생 이름은 : " + names[matching]);

//        int max = 0;
//        if (score[0] < score[(1)]) {
//            if (score[1] < score[2]) {
//                max = score[2];
//            } else {
//                max = score[1];
//            }
//        } else if (score[1] < score[0]) {
//            if (score[0] < score[2]) {
//                max = score[2];
//            } else {
//                max = score[0];
//            }
//        } else {
//        }
//        System.out.println("최대값 : " + max);
    }
}
