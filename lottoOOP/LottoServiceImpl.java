package lottoOOP;

import java.util.Random;

public class LottoServiceImpl implements LottoService {
    @Override
    public void lottoprint(int[] lotto, int[] checkLotto) {
        System.out.println("------로또 당첨번호------");
        for (int i = 0; i < checkLotto.length; i++) {
            System.out.printf(checkLotto[i] + "\t");
        }
        System.out.println("\n------너 로또 번호------");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + "\t");
        }
        System.out.println("\n" + matchingLotto(checkLotto, lotto));
    }

    @Override
    public String matchingLotto(int[] checkLotto, int[] lotto) {
        String result = "";
        int match = 0;
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < checkLotto.length; j++) {
                if (lotto[i] == checkLotto[j]) {
                    match++;
                }
                switch (match) {
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
                    case 2, 1, 0:
                        result = "꽝!!";
                        break;
                }
            }
        }
        return result;
    }

    @Override
    public int[] createLotto(int[] lotto) {
        createNumber(lotto);
        swapNumber(lotto);
        return lotto;
    }

    @Override
    public int randomNumber(int end, int start) {
        Random random = new Random();
        return random.nextInt(end) + start;
    }

    @Override
    public int[] createNumber(int[] lotto) {
        for (int i = 0; i < lotto.length; i++) {
            boolean check = false;
            int randomNumber = randomNumber(10, 1);
            for (int j = 0; j < lotto.length; j++) {
                if (lotto[j] == randomNumber) {
                    check = true;
                }
            }
            if (check == false) {
                lotto[i] = randomNumber;
            } else {
                i--;
            }
        }
        return lotto;
    }

    @Override
    public int[] swapNumber(int[] lotto) {
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto.length - 1; j++) {
                if (lotto[j] > lotto[j + 1]) {
                    int temp = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j + 1] = temp;
                }
            }
        }
        return lotto;
    }
}
