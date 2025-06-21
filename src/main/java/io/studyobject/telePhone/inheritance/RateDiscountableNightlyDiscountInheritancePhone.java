package io.studyobject.telePhone.inheritance;

import io.studyobject.movie.Money;

import java.time.Duration;

public class RateDiscountableNightlyDiscountInheritancePhone extends NightlyDiscountInheritancePhone {

    private Money discountAmount;

    public RateDiscountableNightlyDiscountInheritancePhone(Money nightlyAmount, Money regularAmount, Duration seconds, Money discountAmount) {
        super(nightlyAmount, regularAmount, seconds);
        this.discountAmount = discountAmount;
    }


    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
