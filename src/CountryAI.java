/**
 *
 *
 @author Aryan Inamdar
 @version 5/1/21
 */

public class CountryAI implements MeasurableAI          //implements M, C
{
    private String name;
    private double area;

    /**
     Constructs a country.
     @param aName the name of the country
     @param anArea the area of the country
     */
    public CountryAI(String aName, double anArea)
    {
        name = aName;
        area = anArea;
    }

    /**
     Gets the country name.
     @return the name
     */
    public String getName()
    {
        return "qqq";
    }

    /**
     Gets the area of the country.
     @return the area
     */
    public double getArea()
    {
        return 123; //qqq
    }

    public double getMeasure()
    {
        return 1.23; //qqq getArea() also OK
    }

    //sjsj add these methods below
    //You must write a compareTo method if you want to use
    //the Comparable interface, ref pg350. This returns
    //    -1, when otherObject goes behind this object
    //     0, when otherObject is the same
    //  or 1, when otherObject goes in front of this object
    public int compareTo(Object otherObject)
    {
        CountryAI other = (CountryAI) otherObject;
        return 0;
    }

}

