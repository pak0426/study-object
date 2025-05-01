package io.studyobject.salary;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        double taxRate = getTaxRate();
        double pay = calculatePayFor(name, taxRate);
        System.out.println((describeResult(name, pay)));
    }
}
