/**
 * Write a description of class OrangeHS here.
 *
 * @author Aryan Inamdar
 * @version 4/10/21
 */

import java.util.Random;
public class OrangeHSAryanI {
    public static void main(String[] args) {
        OrangeHSAryanI orangeHSAryanI = new OrangeHSAryanI();
        orangeHSAryanI.getAverageGPA();
        orangeHSAryanI.printHighestGPA();
        orangeHSAryanI.findSmartest();
        orangeHSAryanI.countHowMany(10);
    }


    //instance variables======
    //private String students;
    //private String oneStudent;
    private StudentAI[] studentArr;

    //constructors============
    public OrangeHSAryanI() {
        //oneStudent = "";
        //students = "id100,  9th grade, GPA:3.44,   Name: Mindy Liu";
    }
    //Mutator==============
    public void makeStudentArr(int size)
    {
        Random rr = new Random();
        String[] lastName = {
                "Ahn",   "Aleman", "Amir", "Baker", "Bells",
                "Bird",  "Canones","Capa", "Canon", "Chen",
                "Gray",  "Kim",    "Lam",  "Lee",   "Lu",
                "Ngyuen","Song",   "Tran", "Wang",  "Wu", "Yee"};
        //qqq count how many students are there
        String firstInitials = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        studentArr = new StudentAI[size];
        int idNum = 100;
        int i = 0;
        // qqq rewrite with for loop
        for (int j = 0; j < size; j++) {
            int year = rr.nextInt(4) + 9;
            double gpa = 4 * rr.nextDouble();
            int jj = rr.nextInt(26);
            int k = rr.nextInt( lastName.length );
            String name = firstInitials.charAt(jj) + lastName[k]; // j and k are random integers created using the
            // random object and then they are used as indexes for the firstInitials string and the lastName list
            studentArr[i] = new StudentAI(idNum, year, gpa, name);
            System.out.println(studentArr[i]);
            idNum++;
        }

        do
        {
            int year = rr.nextInt(4) + 9;
            double gpa = 4 * rr.nextDouble();
            int j = rr.nextInt(26);
            int k = rr.nextInt( lastName.length );
            String name = firstInitials.charAt(j) + lastName[k]; // j and k are random integers created using the
            // random object and then they are used as indexes for the firstInitials string and the lastName list
            studentArr[i] = new StudentAI(idNum, year, gpa, name);
            System.out.println(studentArr[i]);
            idNum++;
            i++;
        } while( i<size );

    }

    //Accessor=============
    public String findStudent(String idNum)
    {
        //Hint: look up string commands indexOf and substring
        String oneStudent = "";
        System.out.println( oneStudent );

        return oneStudent;
    }

    //qqq complete to your best ability
    public double getGPA(String id)
    {
        double ans = 0.0;
        //Hint: call findStudent( ) method to get the string with one student information

        //Hint: search for GPA:
        //Hint: search for comma after GPA:
        //Hint: get the string between GPA: and comma
        //Hint: convert the String to a double and return
        return ans;
    }

    public String getName(String id)
    {
        String name="none";
        return name;
    }

    public void getAverageGPA()
    {
        makeStudentArr(5);
        //You must know command to convert string to double
        double sum = 0.0;
        for (int i = 0; i < studentArr.length; i++) {
            sum += studentArr[i].getGpa(); // I added a getGpa method to the student class
        }
        double avg = sum/studentArr.length;
        System.out.println("Average GPA: " + avg);
    }

    public int countHowMany(int year)
    {
        // Counts number of people in a certain grade
        makeStudentArr(10);
        int count = 0;
        for (StudentAI student : studentArr) {
            if (student.getYear() == year) {
                count++;
            }
        }
        System.out.println("There are " + count + " " + year + "th graders in this school.");
        return count;
    }

    //Other================
    public void printMe()
    {
        int j = 0;
        do
        {
            System.out.println(studentArr[j]);
            j++;
        } while(j<studentArr.length);
    }

    public void printHighestGPA() {
        makeStudentArr(5);
        double highestSoFar = studentArr[0].getGpa();
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].getGpa() > highestSoFar) {
                highestSoFar = studentArr[i].getGpa();
            }
        }
        System.out.println(highestSoFar);
    }

    public void findSmartest() {
        makeStudentArr(5);
        StudentAI highestSoFar = studentArr[0];
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].getGpa() > highestSoFar.getGpa()) {
                highestSoFar = studentArr[i];
            }
        }
        String nameOfBest = highestSoFar.getName();
        double gpaOfBest = highestSoFar.getGpa();
        int idOfBest = highestSoFar.getId();
        int yearOfBest = highestSoFar.getYear();

        // System.out.println(highestSoFar.toString());
        System.out.println("Highest Student Details: ");
        System.out.println("Name: " + nameOfBest);
        System.out.println("GPA: " + gpaOfBest);
        System.out.println("ID: " + idOfBest);
        System.out.println("Graduation year: " + yearOfBest);
    }
}
