package io.studyobject.telePhone;

import io.studyobject.movie.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {

    public List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return afterCalculated(result);
    }

    protected Money afterCalculated(Money fee) {
        return fee;
    }
    ;
    abstract protected Money calculateCallFee(Call call);
}

