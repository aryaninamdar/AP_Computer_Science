/**
 * Write a description of class HsStudents here.
 *
 * @author Aryan Inamdar
 * @version 4/10/21
 */

public class StudentAI {
    private int id;
    private int year;
    private double gpa;
    private String name;

    // Job of a constructor is to initialize all data
    public StudentAI(int idNum, int yr, double gpa, String name)
    {
        this.id = idNum;
        this.year = yr;
        this.gpa = gpa;
        this.name = name;
    }

    //accessor
    public String toString()
    {
        String msg = String.format("ID:%d %dth Grade %.2f %s",id,year,gpa,name);
        return msg;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

}
