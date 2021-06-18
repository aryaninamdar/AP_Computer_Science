/**
 *
 *
 * @author Aryan Inamdar
 * @version 5/14/21
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EOC11aHW {
    public static void main(String[] args) throws FileNotFoundException {
        EOC11aHW eoc11aHW = new EOC11aHW();
    }

    // E11.4
    public void readAnyTextFile(String filename) throws FileNotFoundException
    {
        //Step 4: Enter data file name
        String inputFileName = filename;
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);

        int count = 0;
        while(in.hasNextInt())
        {
            int oneData = in.nextInt();
            if(oneData > 0)
            {
                processOneData( oneData, count+1 );
                count++;
            }
        }
        in.close();
    }


    public void readFileInt() throws FileNotFoundException
    {
        String inputFileName = "Mary.txt";
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);

        int count = 0;
        while(in.hasNextInt())
        {
            int oneData = in.nextInt();
            if(oneData > 0)
            {
                processOneData( oneData, count+1 );
                count++;
            }
        }
        in.close();
    }

    public void processOneData(int oneData, int count)
    {
        System.out.println("/* " + count + " */ " + oneData);
    }


    // E11.5
    public void readFileInt2() throws FileNotFoundException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String inputFileName = scanner.nextLine();
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);

        int count = 0;
        while(in.hasNextInt())
        {
            int oneData = in.nextInt();
            if(oneData > 0)
            {
                processOneData( oneData, count+1 );
                count++;
            }
        }
        in.close();
    }

    // E11.6
    // Cannot read files on my comp due to some technical issue which I can not figure out regardless of how much I try
    // I will simulate this problem with arrays instead
    public void E11_6() {
        double[] row1 = {7.5, 3.6};
        double[] row2 = {4.2, 9.7};
        double[] row3 = {6.1, 8.0};
        double column1Sum = row1[0] + row2[0] + row3[0];
        double column2Sum = row1[1] + row2[1] + row3[1];
        System.out.println("Column 1 average: " + (column1Sum/3));
        System.out.println("Column 2 average: " + (column2Sum/3));
    }


    // E11.7
    public void E11_7() {
        double[] row1 = {7.5, 3.6, 5.3, 9.2};
        double[] row2 = {4.2, 9.7, 6.6, 0.4, 7.5};
        double[] row3 = {6.1, 8.0, 2.5};
        int row1Sum = 0;
        for (double num: row1) {
            row1Sum += num;
        }

        int row2Sum = 0;
        for (double num: row2) {
            row2Sum += num;
        }

        int row3Sum = 0;
        for (double num: row3) {
            row3Sum += num;
        }

        System.out.println("Row 1 average: " + (row1Sum/3));
        System.out.println("Row 2 average: " + (row2Sum/3));
        System.out.println("Row 3 average: " + (row3Sum/3));
    }


    // E11.8
    public void readFileInt3() throws FileNotFoundException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String inputFileName = scanner.nextLine();
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);

        int count = 0;
        while(in.hasNextInt())
        {
            int oneData = in.nextInt();
            if(oneData > 0)
            {
                processOneData( oneData, count+1 );
                count++;
            }
        }
        in.close();
        System.out.println("The file has " + count + " lines.");
    }
}
 