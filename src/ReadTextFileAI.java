/**
 *
 *
 * @author Aryan Inamdar
 * @version 5/15/21
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import(s) for file output
import java.io.PrintWriter;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class ReadTextFileAI
{
    final int MAX_LINES = 10;
    private ArrayList<String> lastLines = new ArrayList<>();
    private String inputFileName;
    private int numOfLines;

    public ArrayList<String> readAfile(String fileName) throws FileNotFoundException
    {
        inputFileName = fileName;

        //Step 4: Enter data file name
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);

        //Count number of lines
        numOfLines = 0;
        while(in.hasNextLine() && numOfLines<2) //qqq
        {
            String oneData = in.nextLine();
            //Now you do anything you need with oneData.
            if(oneData.length() > 0)
            {
                numOfLines++;
            }
        }
        in.close(); //like clicking X to close the file

        //qqq: explain
        in = new Scanner(inputFile);
        while(in.hasNextLine()) //check if any lines left
        {
            String oneData = in.nextLine();
            oneData = oneData.trim();
            lastLines.add(oneData);
            //if(lastLines.size()>MAX_LINES)
            //    lastLines.remove(0);
            //Now you do anything you need with oneData.
        }
        in.close(); //like clicking X to close the file
        return lastLines;
    }

    //It's better if you implement this in your child or subclass
    //so you can customize what you want to do
    public void processOneData(String oneData)
    {
        //Step 5: Add code, example
        System.out.println("DBG:"+numOfLines+": "+oneData);
    }

}
