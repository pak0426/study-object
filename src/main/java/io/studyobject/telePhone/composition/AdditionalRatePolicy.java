package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;

import java.util.List;

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

    @Override
    public Money calculateFee(List<Call> calls) {
        assert calls != null;

        Money fee = next.calculateFee(calls);
        Money result = afterCalculated(fee);

        assert result.isGreaterThanOrEqual(Money.ZERO);

        return result;
    }

    abstract protected Money afterCalculated(Money fee);
}
