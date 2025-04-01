package io.studyobject.movie.condition;

import io.studyobject.movie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
