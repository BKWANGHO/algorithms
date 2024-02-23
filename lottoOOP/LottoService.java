package lottoOOP;

public interface LottoService {

    public void lottoprint(int[] lotto, int[] checkLotto);

    public String matchingLotto(int[] checkLotto, int[] lotto);

    int[] createLotto(int[] lotto);
    int randomNumber(int end, int start);

    int[] createNumber(int lotto[]);

    int[] swapNumber(int lotto[]);

}
