package lottoOOP;

import java.util.ArrayList;
import java.util.List;

public class LottoView {
    public static void main(String[] args) {

        List<List<Integer>> lotto = new ArrayList<List<Integer>>();
        int cnt = 0;
        for(int i = 0; i < 5; i++) {
            lotto.add(new ArrayList<Integer>());
            for(int j = 0; j < 6; j++)
                lotto.get(i).add(cnt++);
        }

        lotto.forEach(i -> System.out.println(i.toString()));

//        List<LottoDTO> lotto = new ArrayList<>();
//        LottoService util = new LottoServiceImpl();
//
//
//        for(int i=0;i<6;i++){
//            lotto.add(new LottoDTO(new int[6]));
//        }



    }
}
