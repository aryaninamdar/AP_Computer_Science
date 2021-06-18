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
 * An employee with a name and a mechanism
 * for computing weekly pay.
 * @author Aryan Inamdar
 * @version 4/24/21
 */

public class EmployeeAI2
{
    private String name;

    /**
     Constructs an employee with an empty name.
     */
    public EmployeeAI2()
    {
        name = "unknown";
    }

    /**
     Sets the name of this employee.
     @param employeeName the new name
     */
    public void setName(String employeeName)
    {
        name = employeeName;
    }

    /**
     Gets the name of this employee.
     @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     Computes the pay for one week of work.
     @param hoursWorked the number of hours worked in the week
     @return the pay for the given number of hours
     */
    public double weeklyPay(int hoursWorked)
    {
        return 123;
    }
}
