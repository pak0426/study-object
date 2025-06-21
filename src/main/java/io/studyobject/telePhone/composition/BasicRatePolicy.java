package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;

public abstract class BasicRatePolicy implements RatePolicy {
    @Override
    public Money calculateFee(CompositionPhone compositionPhone) {
        Money result = Money.ZERO;

        for (Call call : compositionPhone.getCalls()) {
            result.plus(calculateCallFee(call));
        }

        return result;
    }

    protected abstract Money calculateCallFee(Call call);
}
