package io.studyobject.telePhone.inheritance;

import io.studyobject.movie.Money;

import java.time.Duration;

public class RateDiscountableAndTaxableRegularInheritancePhone extends RateDiscountableRegularInheritancePhone {
    private double taxRate;

    public RateDiscountableAndTaxableRegularInheritancePhone(Money amount, Duration seconds, Money discountAmount, double taxRate) {
        super(amount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
