package io.studyobject.salary;

import java.util.List;

public class Employees {
    private static final List<Employee> employees = List.of(
            new Employee("직원A", 400, false, 0),
            new Employee("직원A", 300, false, 0),
            new Employee("직원C", 250, false, 0),
            new Employee("아르바이트D", 1, true, 120),
            new Employee("아르바이트E", 1, true, 120),
            new Employee("아르바이트F", 1, true, 120)
    );

    public static double calculatePay(String name, double taxRate) {
        if (isHourly(name)) {
            return calculateHourlyPayFor(name, taxRate);
        } else {
            return calculatePayFor(name, taxRate);
        }
    }

    public static boolean isHourly(String name) {
        int index = findEmployeeIndex(name);
        return employees.get(index).isHourly();
    }

    public static double calculateHourlyPayFor(String name, double taxRate) {
        int index = findEmployeeIndex(name);
        double basePay = employees.get(index).getBasePay() * employees.get(index).getTimeCard();
        return basePay - (basePay * taxRate);
    }

    public static double calculatePayFor(String name, double taxRate) {
        int index = findEmployeeIndex(name);
        double basePay = employees.get(index).getBasePay();
        return basePay - (basePay * taxRate);
    }

    private static int findEmployeeIndex(String name) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private static double sumOfBasePays() {
        double result = 0;

        for (int i = 0; i < employees.size(); i++) {
            String name = employees.get(i).getName();
            if (!isHourly(name)) {
                result += employees.get(i).getBasePay();
            }
        }
        return result;
    }
}
