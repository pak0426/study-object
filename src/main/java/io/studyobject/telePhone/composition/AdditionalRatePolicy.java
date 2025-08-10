package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;

import java.util.List;

public abstract class AdditionalRatePolicy implements RatePolicy {
    protected RatePolicy next;

    public AdditionalRatePolicy(RatePolicy next) {
        this.next = next;
        // 불변식
        assert next != null;
    }

    @Override
    public Money calculateFee(CompositionPhone compositionPhone) {
        Money fee = next.calculateFee(compositionPhone);
        return afterCalculated(fee);
    }

    @Override
    public Money calculateFee(List<Call> calls) {
        // 불변식
        assert next != null;
        // 사전조건
        assert calls != null;

        Money fee = next.calculateFee(calls);
        Money result = afterCalculated(fee);

        // 사후 조건
        assert result.isGreaterThanOrEqual(Money.ZERO);
        // 불변식
        assert next != null;

        return result;
    }

    abstract protected Money afterCalculated(Money fee);
}
