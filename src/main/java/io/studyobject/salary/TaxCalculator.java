package io.studyobject.salary;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        double taxRate = getTaxRate();
        double pay = calculatePayFor(name, taxRate);
        System.out.println((describeResult(name, pay)));
    }

    private static double getTaxRate() {
        System.out.println("세율을 입력하세요: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        return Double.parseDouble(input);
    }
}
