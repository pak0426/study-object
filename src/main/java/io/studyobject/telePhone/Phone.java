package io.studyobject.telePhone;

import io.studyobject.movie.Money;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
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

    protected abstract Money calculateCallFee(Call call);
}

