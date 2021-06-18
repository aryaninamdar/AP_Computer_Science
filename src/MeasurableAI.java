/**
 *
 * @author Aryan Inamdar
 * @version 5/1/21
 */

import java.util.ArrayList;

public interface MeasurableAI
{
    /**
     * List the REQUIRED methods that must be in ALL
     * classes that "implements Measurable"
     */
    double getMeasure();
    // Define all methods that you want implemented classes to use
    // int setSomething(int newValue);
    // String getName();

    /**
     * Pre Java 8 Release (2014) the methods implemented
     * below had to be in a separate "Data" class and not
     * in the interface file.
     */
    /**
     Computes the average of the measures of the given objects.
     @param objects an array of Measurable objects
     @return the average of the measures
     */
    public static double average(MeasurableAI[] objects)
    {
        double sum = 0;
        //qqq rewrite this with a normal "indexed" for loop
        for (int i = 0; i < objects.length; i++) // rewritten as indexed for loop
        {
            sum = sum + objects[i].getMeasure();
        }
        if (objects.length > 0)
        {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    }

    /**
     Computes the largest of the measures of the given objects.
     @param objects an array of Measurable objects
     @return the largest of the measures
     */
    public static double max(MeasurableAI[] objects)
    {
        double maxV = objects[0].getMeasure();
        //qqq rewrite with a reverse for loop, from last to first
        for (MeasurableAI obj : objects)
        {
            double amt = obj.getMeasure();
            if(amt > maxV)
                maxV = amt;
        }
        if (objects.length > 0)
        {
            return maxV;
        }
        else
        {
            return -1;
        }
    }

    /**
     Computes the smallest of the measures of the given objects.
     @param objects an array of Measurable objects
     @return the smallest of the measures
     */
    public static double min(MeasurableAI[] objects)
    {
        //qqq copy the max method from above and
        //change it to find min
        return -123;
    }

    /**
     Find the largest object
     @param objects an array of Measurable objects
     @return the largest object NOT THE measure
     */
    public static MeasurableAI largest(MeasurableAI[] objects)
    {
        //not implemented
        return objects[0];
    }

    /**
     Find the smallest Object
     @param objects an array of MeasurableYIobjects
     @return the minimum of the measures, null if array is empty
     */
    public static MeasurableAI smallest(MeasurableAI[] objects)
    {
        //not implemented
        return objects[0];
    }

    public static double average(ArrayList<MeasurableAI> objects)
    {
        double sum = 0;
        for (MeasurableAI obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        //qqq rewrite this "one liner" for easy reading
        if (objects.size() > 0) { return sum / objects.size(); } else { return 0; }
    }
}
