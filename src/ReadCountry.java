/**
 *
 *
 * @author Aryan Inamdar
 * @version 5/8/21
 */

//These 3 imports needed for reading a text file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ReadCountry {
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
        String inputFileName = "Mary.txt";
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
}
 