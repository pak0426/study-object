package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;

public interface RatePolicy {
    Money calculateFee(CompositionPhone compositionPhone);
}
