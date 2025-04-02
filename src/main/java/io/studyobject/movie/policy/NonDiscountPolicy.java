package io.studyobject.movie.policy;

import io.studyobject.movie.Money;
import io.studyobject.movie.Screening;

public class NonDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
