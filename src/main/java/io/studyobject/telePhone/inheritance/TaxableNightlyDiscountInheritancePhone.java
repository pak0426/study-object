package io.studyobject.telePhone.inheritance;

import io.studyobject.movie.Money;

import java.time.Duration;

public class TaxableNightlyDiscountInheritancePhone extends NightlyDiscountInheritancePhone {
    private double taxRate;

    public TaxableNightlyDiscountInheritancePhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        super(nightlyAmount, regularAmount, seconds);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
