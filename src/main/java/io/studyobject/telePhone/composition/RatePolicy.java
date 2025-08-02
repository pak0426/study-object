package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Call;

import java.util.List;

public interface RatePolicy {
    Money calculateFee(CompositionPhone compositionPhone);
    Money calculateFee(List<Call> calls);
}
