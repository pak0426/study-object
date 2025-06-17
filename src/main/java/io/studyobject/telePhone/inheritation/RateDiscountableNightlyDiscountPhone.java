package io.studyobject.telePhone.inheritation;

import io.studyobject.movie.Money;
import io.studyobject.telePhone.NightlyDiscountPhone;

import java.time.Duration;

public class RateDiscountableNightlyDiscountPhone extends NightlyDiscountPhone {

    private Money discountAmount;

    public RateDiscountableNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, Money discountAmount) {
        super(nightlyAmount, regularAmount, seconds);
        this.discountAmount = discountAmount;
    }


    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
