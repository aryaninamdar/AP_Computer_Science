/**
 *
 * @author Aryan Inamdar
 * @version 4/16/21
 */

import java.util.Random;

public class EOC09aHW {
    public static void main(String[] args) {
        EOC09aHW eoc09aHW = new EOC09aHW();
        eoc09aHW.E9_1();
    }

    public void R9_2() {
        // a
        // Hourly Employee, Salaried Employee, Manager

        // b
        // Salaried Employee, Employee

        // c
        // Super: Employee, Sub: Manager

        // d
        // Hourly Employee, Salaried Employee, Manager

        // e
        // None

        // f
        // hoursWorked, hourlyWage, pay
    }

    public void R9_3() {
        // Salaried Employee
    }

    public void R9_7() {
        // withdrawals, FREE_WITHDRAWALS, WITHDRAWAL_FEE
    }

    public void E9_1() {
        EmployeeAI[] employees = new EmployeeAI[5];
        employees[0] = new EmployeeAI("Art", 600.00);
        employees[1] = new EmployeeAI("Betty", 650.00);
        employees[2] = new EmployeeAI("Carl", 500.00);
        employees[3] = new EmployeeAI("Donna", 700.00);
        employees[4] = new EmployeeAI("Ed", 650.00);

        Random random = new Random();
        int[] bonuses = new int[5];
        for (int i = 0; i < bonuses.length; i++) {
            bonuses[i] = random.nextInt(200);
        }

        for (int i = 0; i < employees.length; i++) {
            employees[i].setBaseSalary(employees[i].getBaseSalary() + bonuses[i]);
            System.out.println("New salary for " + employees[i].getName() + " is " + employees[i].getBaseSalary());
        }
    }

    // I don't have access to the classes from the other questions
}
