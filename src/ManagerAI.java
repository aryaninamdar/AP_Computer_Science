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
 * A manager with mechanisms for
 * computing weekly pay.
 * @author Aryan Inamdar
 * @version 4/24/21
 */
public class ManagerAI extends SalariedEmployeeAI
{
    private double weeklyBonus;

    /**
     Constructs a manager with a given name,
     annual salary and weekly bonus.
     @param name the name of this employee
     @param salary the annual salary
     @param bonus the weekly bonus
     */
    public ManagerAI(String name, double salary, double bonus)
    {
        //next line calls the parent constructor
        super( name, salary );
        weeklyBonus = bonus;
    }

    public double weeklyPay(int hours)
    {
        return 123.4;
    }
}

