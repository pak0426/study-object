package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class CompositionPhone {

    private RatePolicy ratePolicy;
    public List<Call> calls = new ArrayList<>();

    public CompositionPhone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }
}

