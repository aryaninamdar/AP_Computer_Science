/**
 * Write a description of class ReadBook here.
 *
 * @author Aryan Inamdar
 * @version 5/15/21
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
public class ReadBookAI extends ReadTextFileAI
{
    ArrayList<String> content = new ArrayList<>();
    public void test1() throws FileNotFoundException
    {
        ReadTextFileAI myStuff = new ReadTextFileAI();
        content = myStuff.readAfile("Charlotte1.txt");
        for(String each : content)
        {
            System.out.println(each);
        }

    }
}