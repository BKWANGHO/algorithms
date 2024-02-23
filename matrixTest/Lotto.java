package matrixTest;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Lotto {
    public static void main(String[] args) {
//        1. 서로 겹치지 않는 숫자 6개 생성
//        2. 각 숫자는 1~45 범위 내 생성
//        3. 매번 실행시 다른 숫자 출력
//        4. 오름차순 정렬
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
//            2. 각 숫자는 1~45 범위 내 생성
            lotto[i] = (int) ((Math.random() * 44) + 1);
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
//                    1. 서로 겹치지 않는 숫자 6개 생성
                    i--;
                    break;
                } else {
                }
            }
        }
//        오름차순 정렬
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto.length; j++) {
                if (lotto[i] < lotto[j]) {
                    int swap = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = swap;
                }
            }
        }
        System.out.print("로또번호는 : ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }


}
