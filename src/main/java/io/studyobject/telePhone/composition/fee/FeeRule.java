package io.studyobject.telePhone.composition.fee;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;

public class FeeRule {
    private FeeCondition feeCondition;
    private FeePerDuration feePerDuration;

    public FeeRule(FeeCondition feeCondition, FeePerDuration feePerDuration) {
        this.feeCondition = feeCondition;
        this.feePerDuration = feePerDuration;
    }

    public Money calculateFee(Call call) {
        return feeCondition.findTimeIntervals(call)
                .stream()
                .map(condition -> feePerDuration.calculate(condition))
                .reduce(Money.ZERO, Money::plus);
    }
}
