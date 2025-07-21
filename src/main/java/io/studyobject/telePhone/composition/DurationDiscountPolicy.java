package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;

import java.util.ArrayList;
import java.util.List;

public class DurationDiscountPolicy extends BasicRatePolicy {

    private List<DurationDiscountRule> rules = new ArrayList<>();

    @Override
    protected Money calculateCallFee(Call call) {
        Money result = Money.ZERO;
        for (DurationDiscountRule rule : rules) {
            result.plus(rule.calculate(call));
        }
        return result;
    }
}
