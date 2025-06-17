package io.studyobject.telePhone.composition;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.Phone;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
