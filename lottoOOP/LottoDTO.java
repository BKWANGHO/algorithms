package lottoOOP;

import java.util.Arrays;

public class LottoDTO {
    private int[] lotto;


    public LottoDTO(int[] lotto) {
        this.lotto = lotto;
    }

    public int[] getLotto() {
        return lotto;
    }

    public void setLotto(int[] lotto) {
        this.lotto = lotto;
    }

    @Override
    public String toString() {
        return "LottoDTO{" +
                "lotto=" + Arrays.toString(lotto) +
                '}';
    }
}
