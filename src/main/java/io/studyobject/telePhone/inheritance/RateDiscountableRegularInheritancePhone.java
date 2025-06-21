package io.studyobject.telePhone.inheritance;

import io.studyobject.movie.Money;

import java.time.Duration;

public class RateDiscountableRegularInheritancePhone extends RegularInheritancePhone {

    private Money discountAmount;

    public RateDiscountableRegularInheritancePhone(Money amount, Duration seconds, Money discountAmount) {
        super(amount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
