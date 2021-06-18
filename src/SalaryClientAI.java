/**
 * A tester for Employee, Manager
 * SalariedEmployee, HourlyEmployee
 *
 * @author Aryan Inamdar
 * @version 4/24/21
 */

import java.util.Scanner;
import java.util.ArrayList;
public class SalaryClientAI
{
    private ArrayList<EmployeeAI2> staff = new ArrayList<EmployeeAI2>( );
    private EmployeeAI[] staff1 = new EmployeeAI[10];

    public void test1()
    {
        System.out.println();
        EmployeeAI2[] staff = new EmployeeAI2[3];
        staff[0] = new SalariedEmployeeAI("Aryan Inamdar", 200000);
        staff[1] = new HourlyEmployeeAI("James Bond", 30.0);
        staff[2] = new ManagerAI("Tom Cruise", 100000, 150);
    }

    public void test2()
    {
        EmployeeAI2 ee = new HourlyEmployeeAI("Harry Hour", 30);
        staff.add( ee );

        ee = new ManagerAI("Mark Melendrez", 120000,1000);
        staff.add( ee );

        ee = new SalariedEmployeeAI("Sam Sloan", 52000);
        staff.add( ee );

        ee = new HourlyEmployeeAI("Helen Hill", 30);
        staff.add ( ee );

        ee = new SalariedEmployeeAI("Sally Su", 52000);
        staff.add ( ee );

        ee = new ManagerAI("Mary Moon", 104000, 50);
        staff.add ( ee );

        //qqq add 1 hourly workers with first name beginning with "H"
        ee = new HourlyEmployeeAI("Harry B.", 15);
        staff.add ( ee );

        //qqq add 1 salaried workers with first name beginning with "S"
        ee = new SalariedEmployeeAI("Sam A.", 75000);
        staff.add ( ee );

        //qqq add 1 manager with first name beginning with "M"
        ee = new ManagerAI("Margaret G.", 250000, 300);
        staff.add ( ee );

        //next you can see how much pay each of these people
        //get for 20hrs, 40hrs, 60hrs, 120hrs and print

        for(int i = 0; i <= 2; i++) //qqq correct this
        {
            int hours = 10;
            //qqq print each employee name and
            //their pay for this week
            System.out.print(staff.get(i).getName() + ": ");
            System.out.println("Salary: " + 123); //qqq
        }
    }

}
