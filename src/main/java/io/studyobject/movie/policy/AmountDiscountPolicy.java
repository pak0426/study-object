package io.studyobject.movie.policy;

import io.studyobject.movie.Money;
import io.studyobject.movie.Screening;
import io.studyobject.movie.condition.DefaultDiscountPolicy;
import io.studyobject.movie.condition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return null;
    }
}
