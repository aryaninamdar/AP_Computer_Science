/**
 * UML Class Diagram qqq
 * -------------------------
 *                         |
 * -------------------------
 *                         |
 * -------------------------
 *                         |
 * -------------------------
 * Hourly Employee with mechanism
 * for computing weekly pay.
 * @author Aryan Inamdar
 * @version 4/24/21
 */

public class HourlyEmployeeAI extends EmployeeAI2
{
    private double hourlyWage;

    /**
     Constructs an hourly employee with a
     given name and hourly wage.
     @param name of this employee
     @param wage, e.g 15.41 perhour
     */
    public HourlyEmployeeAI(String name, double wage)
    {
        setName(name);
        hourlyWage = wage;
    }

    /**
     * Method weeklyPay
     * Calculate pay for the week.
     * Add overtime pay if >40 hours of 1.5 regular pay
     * Add doubletime pay if >60 hours, i.e. double pay --> Not doing this
     * @param hoursWorked A parameter
     * @return wage
     */
    public double weeklyPay(int hoursWorked)
    {
        double weeklyWage = 0;
        // overtime
        if (hoursWorked > 40 && hoursWorked <= 60) {
            weeklyWage = (40*hourlyWage) + ((hoursWorked-40)*hourlyWage*1.5);
        }
        // regular
        else if (hoursWorked < 40) {
            weeklyWage = hoursWorked*hourlyWage;
        }
        else {
            System.out.println("No double time pay. You get overtime salary instead.");
            weeklyWage = (40*hourlyWage) + ((hoursWorked-40)*hourlyWage*1.5);
        }
        return weeklyWage;
    }
}

