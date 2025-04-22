package io.studyobject.dataMovie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
