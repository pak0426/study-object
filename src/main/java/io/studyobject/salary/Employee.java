package io.studyobject.salary;

import lombok.Getter;

@Getter
public class Employee {
    private String name;
    private double basePay;
    private boolean hourly;
    private int timeCard;

    public Employee(String name, double basePay, boolean hourly, int timeCard) {
        this.name = name;
        this.basePay = basePay;
        this.hourly = hourly;
        this.timeCard = timeCard;
    }

    public double calculatePay(double taxRate) {
        if (hourly) {
            return calculateHourlyPay(taxRate);
        }
        return calculateSalariedPay(taxRate);
    }

    private double calculateHourlyPay(double taxRate) {
        return (basePay * timeCard) - (basePay * timeCard) * taxRate;
    }

    private double calculateSalariedPay(double taxRate) {
        return basePay - (basePay * taxRate);
    }

    public double monthlyBasePay() {
        if (hourly) {
            return 0;
        }
        return basePay;
    }
}
