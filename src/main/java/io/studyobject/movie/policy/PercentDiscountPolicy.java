package io.studyobject.movie.policy;

import io.studyobject.movie.Money;
import io.studyobject.movie.Screening;
import io.studyobject.movie.condition.DefaultDiscountPolicy;
import io.studyobject.movie.condition.DiscountCondition;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
