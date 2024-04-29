package solution;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LottoNumberGenerator {

    public List<Integer> generator(final int money) {
        if (!isValidMoney(money)) { //만약 금액이 올바르지 않다면?
            throw new RuntimeException("올바른 금액이 아닙니다."); //출력
        }
        return generate(); //만약이 금액이 올바르다면? 로또 생성
    }



    private boolean isValidMoney(final int money) {
        return money == 1000;
    }

    private List<Integer> generate() {
        return new Random()
                .ints(1, 45+1)
                .distinct()
                .limit(6  )
                .boxed()
                .collect( Collectors.toList());
    }
}
