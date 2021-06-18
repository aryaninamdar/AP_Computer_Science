/**
 * Write a description of class FinalB2YI here.
 *
 * @author Aryan Inamdar
 * @version 5/23/21
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class FinalB2AI
{
    public static void main(String[] args) {
        start();
    }

    public static ArrayList<Restaurant> franchise = new ArrayList<Restaurant>();

    public static void start()
    {
        String[] data = {
                //Store name, Number served, Location, average sales per visit
                "Store1, 289 served Buena Park; 25.00",
                "BobStore#1, 134 served Los Angeles; 25.00",
                "Store3, 356 served Lake Forest; 35.00",
                "Store4, 290 served Riverside; 95.00",
                "Store5, 167 served  San Diego; 45.57",
                "BobStore#2, 145 served Long Beach; 25.00",
                "Store9, 163 served   Tri-City; 55.00",
                "Store8, 278 served San Diego; 25.00",
                "Store7,181 served Costa Mesa; 45.00",
                "Store6, 232 served Buena Park; 75.00" };

        String name, city="", servedS="",avgSaleS="";
        double avgPmt= 0;
        int served=-123, pos1, pos2;
        //qqq assume the array "data" was loaded from a file.
        //The number of customers is low because of Covid.
        //Extract the city, number of customers served, 
        //and the sales per customer. 
        //Complete the method to print a report similiar to below
        /*Sample terminal:
        Daily Sales Report by YOUR NAME
        Location        Served AvgSales
        ===============================
        Buena Park      289     $25.00
        Los Angeles     134     $25.00
        Lake Forest     356     $35.00
        . . .
        Average store: 223 customers daily.  
        Revenue: $1.007 million */


        int totalServed=0;
        double totalPrice=0;
        System.out.println("Report Daily Sales by Aryan Inamdar");
        System.out.println("Location   \tServed \tAvgSales");
        System.out.println("=================================");
        for(int k=0; k<data.length; k++)
        {
            //qqq extract the city
            pos1 = data[k].indexOf("d");
            pos2 = data[k].indexOf(";");
            for (int i = 0; i < data[k].length(); i++) {
                if (i > pos1 && i < pos2) {
                    city += data[k].charAt(i);
                }
            }
            System.out.print(city);

            //qqq extract the number of customers served
            pos1 = data[k].indexOf(",");
            pos2 = data[k].indexOf("s");
            for (int i = 0; i < data[k].length(); i++) {
                if (i > pos1 && i < pos2) {
                    servedS += data[k].charAt(i);
                }
            }
            System.out.print("\t"+servedS);
            served = Integer.parseInt(servedS);
            totalServed += served;

            //qqq extract the average payment
            pos1 = data[k].indexOf(";");
            for (int i = 0; i < data[k].length(); i++) {
                if (i > pos1) {
                    avgSaleS += data[k].charAt(i);
                }
            }
            avgPmt = Integer.parseInt(avgSaleS);
            System.out.printf("\t$%.02f\n",avgPmt);
            totalPrice += avgPmt;

            //qqq print "Average store: _____ customer daily"
            //qqq print "Revenue: ____ million"
            //You may use print or printf below
            System.out.println( "\nAverage store: "+ totalServed/10 + " customers daily. " );
            System.out.println( "\nRevenue: $"+ (totalPrice*365)/1000000 + " million");

            //This updates predictions for next year sales
            year2022AryanInamdar();
        }
    }

    public static void year2022AryanInamdar()
    {
        //qqq See the UML diagram. The franchise arrayList contains Restaurant objects. By 2022 the pandemic has disappeared. 
        //The number of customers doubles. Write a loop to update the arrayList. Note: the Restaurant and Store class
        //is by another programmer and not available. Your  code is based on the UML diagrams.

    }
}