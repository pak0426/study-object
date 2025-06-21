package io.studyobject.telePhone.inheritance;

import io.studyobject.movie.Money;

import java.time.Duration;

public class TaxableAndRateDiscountableRegularInheritancePhone extends TaxableRegularInheritancePhone {

    private Money discountAmount;

    public TaxableAndRateDiscountableRegularInheritancePhone(Money amount, Duration seconds, double taxRate, Money discountAmount) {
        super(amount, seconds, taxRate);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).minus(discountAmount);
    }
}
