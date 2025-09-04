package io.studyobject.example.appendix.b;

import io.studyobject.movie.Money;

public class HourEmployee {
    private String name;
    private Money basePay;
    private int timeCard;

    public HourEmployee(String name, Money basePay, int timeCard) {
        this.name = name;
        this.basePay = basePay;
        this.timeCard = timeCard;
    }

    public Money calculatePay(double taxRate) {
        return basePay.times(timeCard).minus(basePay.times(taxRate));
    }
}
