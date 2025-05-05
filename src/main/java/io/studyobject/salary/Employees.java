package io.studyobject.salary;

public class Employees {
    private static final String[] employees = {"직원A", "직원B", "직원C", "직원D", "직원E", "직원F"};
    private static final double[] basePays = {400, 300, 250, 1, 1, 1.5};
    private static final boolean[] hourlys = {false, false, false, true, true, true};
    private static final int[] timeCards = {0, 0, 0, 120, 120, 120};

    public static double calculatePay(String name, double taxRate) {
        if (isHourly(name)) {
            return calculateHourlyPayFor(name, taxRate);
        } else {
            return calculatePayFor(name, taxRate);
        }
    }

    public static boolean isHourly(String name) {
        int index = findEmployeeIndex(name);
        return hourlys[index];
    }

    public static double calculateHourlyPayFor(String name, double taxRate) {
        int index = findEmployeeIndex(name);
        double basePay = basePays[index] * timeCards[index];
        return basePay - (basePay * taxRate);
    }

    public static double calculatePayFor(String name, double taxRate) {
        int index = findEmployeeIndex(name);
        double basePay = basePays[index];
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

    private static double sumOfBasePays() {
        double result = 0;

        for (int i = 0; i < employees.length; i++) {
            String name = employees[i];
            if (!isHourly(name)) {
                result += basePays[i];
            }
        }
        return result;
    }
}
