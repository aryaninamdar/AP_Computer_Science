/**
 * UML Class Diagram qqq
 * -------------------------
 *                         |
 * -------------------------
 *                         |
 * -------------------------
 *                         |
 * -------------------------
 *
 * A salaried employee with a name and
 * a mechanism for computing weekly pay.
 * @author Aryan Inamdar
 * @version 4/24/21
 */

public class SalariedEmployeeAI extends EmployeeAI2
{
    private double annualSalary;

    /**
     Constructs a salaried employee with
     a given name and annual salary.
     @param name of this employee
     @param salary per year
     */
    public SalariedEmployeeAI (String name, double salary)
    {
        annualSalary = salary;
        setName( name ); //using parent's method

    }

    //note: hoursWorked doesn't matter. We could remove it
    //but the programmer doing the SalaryClient is a hot head
    //and will be unpleasant.
    public double weeklyPay(int hoursWorked)
    {
        return (annualSalary/52);
    }
}
