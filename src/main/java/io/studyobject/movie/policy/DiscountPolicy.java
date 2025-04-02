package io.studyobject.movie.policy;

import io.studyobject.movie.Money;
import io.studyobject.movie.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
