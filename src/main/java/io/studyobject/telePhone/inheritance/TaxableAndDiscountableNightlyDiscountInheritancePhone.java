package io.studyobject.telePhone.inheritance;

import io.studyobject.movie.Money;

import java.time.Duration;

public class TaxableAndDiscountableNightlyDiscountInheritancePhone extends TaxableNightlyDiscountInheritancePhone {

    private Money discountAmount;

    public TaxableAndDiscountableNightlyDiscountInheritancePhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate, Money discountAmount) {
        super(nightlyAmount, regularAmount, seconds, taxRate);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).minus(discountAmount);
    }
}
