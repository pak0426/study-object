package io.studyobject.telePhone;

import io.studyobject.movie.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPhone {

    public List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return result;
    }

    abstract protected Money calculateCallFee(Call call);
}
