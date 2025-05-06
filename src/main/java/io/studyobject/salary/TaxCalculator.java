package io.studyobject.salary;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        String name = typingName();
        double taxRate = getTaxRate();
        double pay = Employees.calculatePay(name, taxRate);
        System.out.println((describeResult(name, pay)));
    }

    private static String typingName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static double getTaxRate() {
        System.out.println("세율을 입력하세요: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        return Double.parseDouble(input);
    }

    private static String describeResult(String name, double taxRate) {
        return String.format("이름: %s, 급여: %s", name, taxRate);
    }
}
