package matrixTest;

import java.util.Random;

/*
 * 로또 발급은 같다. 하나는 구매한 로또이다.
 * 추가된 로직은 추첨된 로또이다.
 * 두 로또의 일치 여부에 따라
 * 다음과 같은 메시지를 출력한다.
 * 단 구매 로또 번호와 추첨 로또 번호 모두 같이 출력한다.
 * 1~8까지 중복없는 숫자 6개를 만든다.
 * 1등 : 6개 맞춤
 * 2등 : 5개 맞춤
 * 3등 : 4개 맞춤
 * 4등 : 3개 맞춤
 * 꽝 : 2개 이하
 * */
public class LottoMatching {
    public static void main(String[] args) {
        int[] checkLotto = new int[6];
        int[] lotto = new int[6];

//      당첨 로또 생성
        checkLotto = createLotto(checkLotto);
//      로또 1개 생성
        lotto = createLotto(lotto);
//      당첨 확인
        matchingLotto(checkLotto,lotto);
//      출력
        lottoprint(lotto,checkLotto);
    }

    private static void lottoprint(int[] lotto, int[] checkLotto) {
        System.out.println("------로또 당첨번호------");
        for(int i=0;i<checkLotto.length;i++){
            System.out.printf(checkLotto[i] +"\t");
        }
        System.out.println("\n------너 로또 번호------");
        for(int i=0;i<lotto.length;i++){
            System.out.print(lotto[i]+ "\t");
        }
        System.out.println("\n"+matchingLotto(checkLotto,lotto));
    }


    private static String matchingLotto(int[] checkLotto, int[] lotto) {
        String result ="";
        int match =0;
        for(int i=0; i<lotto.length;i++){
            for(int j=0;j<checkLotto.length;j++){
                if(lotto[i] == checkLotto[j]){
                    match++;
                }
                switch (match){
                    case 6:
                        result = "1등이다";
                        break;
                    case 5:
                        result = "2등이다";
                        break;
                    case 4:
                        result = "3등이다";
                        break;
                    case 3:
                        result = "4등이다";
                        break;
                    case 2,1,0:
                        result = "꽝!!";
                        break;
                }
            }
        }
        return result;
    }

    private static int[] createLotto(int[] lotto) {
    createNumber(lotto);
    swapNumber(lotto);
    return lotto;
    }

    private static int randomNumber(int end, int start) {
        Random random = new Random();
        return random.nextInt(end) + start;
    }

    private static int[] createNumber(int lotto[]) {
        for (int i = 0; i < lotto.length; i++) {
            boolean check = false;
            int randomNumber = randomNumber(10, 1);
            for (int j = 0; j < lotto.length; j++) {
                if(lotto[j] == randomNumber){
                    check = true;
                }
            }
            if(check == false){
                lotto[i] = randomNumber;
            }else {
                i--;
            }
        }
            return lotto;
    }

    private static int[] swapNumber(int lotto[]) {
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto.length - 1; j++) {
                if(lotto[j]>lotto[j+1]){
                    int temp = lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j+1] = temp;
                }
            }
        }
        return lotto;
    }

}
