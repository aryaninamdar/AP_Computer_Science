/**
 *
 * @author Aryan Inamdar
 * @version 5/15/21
 */

//These 3 imports needed for reading a text file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ReadPrices {
    public static void main(String[] args) throws FileNotFoundException {
        ReadPrices readPrices = new ReadPrices();
        readPrices.processData();
    }

    //Reading data from a text file of ints
    //Step 1: include the 3 imports at top of this code
    //Step 2: copy/paste method readAnyTextFile()
    public void readAnyTextFile(String filename) throws FileNotFoundException
    {
        //Step 4: Enter data file name
        String inputFileName = filename;
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);

        //Count number of lines
        int count = 0;
        while(in.hasNextInt()) //check if any ints left
        {
            int oneData = in.nextInt();
            //Now you do anything you need with oneData.
            if(oneData > 0) //optional
            {
                processOneData( oneData, count+1 );
                count++;
            }
        }
        in.close(); //like clicking X to close the file
    }

    //Step 3: copy/paste method processOneLine()
    public void readFileInt() throws FileNotFoundException
    {
        //Step 4: Enter data file name
        String inputFileName = "phoneBills.txt";
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);

        //Count number of lines
        int count = 0;
        while(in.hasNextInt()) //check if any ints left
        {
            int oneData = in.nextInt();
            //Now you do anything you need with oneData.
            if(oneData > 0) //optional
            {
                processOneData( oneData, count+1 );
                count++;
            }
        }
        in.close(); //like clicking X to close the file
    }

    public void processOneData(int oneData, int count)
    {
        //Step 5: Add code, example
        //
        System.out.println("DBGi"+count+": "+oneData);
    }

    // When I try running the original program it says that phoneBills.txt does not exist even though I downloaded it to my files.
    public void processData() {
        String[] users = {"Dad", "Mom", "Son", "Daughter"};
        double[][] bills = new double[3][4];
        bills[0][0] = 45.24;  bills[0][1] = 54.67;  bills[0][2] = 32.55;  bills[0][3] = 25.61;
        bills[1][0] = 65.29;  bills[1][1] = 49.75;  bills[1][2] = 32.08;  bills[1][3] = 26.11;
        bills[2][0] = 75.24;  bills[2][1] = 54.53;  bills[2][2] = 34.55;  bills[2][3] = 28.16;

        System.out.println(Arrays.toString(users));
        System.out.print(Arrays.toString(bills[0]));
        System.out.print(Arrays.toString(bills[1]));
        System.out.print(Arrays.toString(bills[2]));

        double janExpense = bills[0][0] + bills[0][1] + bills[0][2] + bills[0][3];
        double febExpense = bills[1][0] + bills[1][1] + bills[1][2] + bills[1][3];
        double marExpense = bills[2][0] + bills[2][1] + bills[2][2] + bills[2][3];
        System.out.println("\n");
        System.out.println("January: " + janExpense);
        System.out.println("February: " + febExpense);
        System.out.println("March: " + marExpense);

        double dadExpense = bills[0][0] + bills[1][0] + bills[2][0];
        double momExpense = bills[0][1] + bills[1][1] + bills[2][1];
        double sonExpense = bills[0][2] + bills[1][2] + bills[2][2];
        double daughterExpense = bills[0][3] + bills[1][3] + bills[2][3];
        System.out.println("\n");
        System.out.println("Dad: " + dadExpense);
        System.out.println("Mom: " + momExpense);
        System.out.println("Son: " + sonExpense);
        System.out.println("Daughter: " + daughterExpense);
    }
}
 