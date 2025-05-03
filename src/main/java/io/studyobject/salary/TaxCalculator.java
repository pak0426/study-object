package io.studyobject.salary;

import java.util.Scanner;

public class TaxCalculator {

    private static final String[] employees = {"직원A", "직원B", "직원C"};
    private static final int[] basePays = {400, 300, 250};

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

    private static double calculatePayFor(String name, double taxRate) {
        int index = findEmployeeIndex(name);
        int basePay = basePays[index];
        return basePay - (basePay * taxRate);
    }

    private static int findEmployeeIndex(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private static String describeResult(String name, double taxRate) {
        return String.format("이름: %s, 급여: %s", name, taxRate);
    }
}
