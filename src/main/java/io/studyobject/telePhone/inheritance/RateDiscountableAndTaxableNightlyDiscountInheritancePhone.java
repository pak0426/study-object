package io.studyobject.telePhone.inheritance;

import io.studyobject.movie.Money;

import java.time.Duration;

public class RateDiscountableAndTaxableNightlyDiscountInheritancePhone extends RateDiscountableNightlyDiscountInheritancePhone {

    private double taxRate;

    public RateDiscountableAndTaxableNightlyDiscountInheritancePhone(Money nightlyAmount, Money regularAmount, Duration seconds, Money discountAmount, double taxRate) {
        super(nightlyAmount, regularAmount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
