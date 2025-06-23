package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;

public abstract class AdditionalRatePolicy implements RatePolicy {
    private RatePolicy next;

    public AdditionalRatePolicy(RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(CompositionPhone compositionPhone) {
        Money fee = next.calculateFee(compositionPhone);
        return afterCalculated(fee);
    }

    abstract protected Money afterCalculated(Money fee);
}
