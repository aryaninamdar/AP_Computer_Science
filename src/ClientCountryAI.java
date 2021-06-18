/**
 *
 *
 * @author Aryan Inamdar
 * @version 5/1/21
 */

import java.util.Arrays;

public class ClientCountryAI
{
    public void test1Country()
    {
        // Calling the average method with an array of Country objects
        MeasurableAI[] countries = new MeasurableAI[3];
        countries[0] = new CountryAI("Uruguay",  176220);
        countries[1] = new CountryAI("Thailand", 513120);
        countries[2] = new CountryAI("Japan",   30510);

        double averageArea = MeasurableAI.average(countries);
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 239950");

        double largest = MeasurableAI.max(countries);
        MeasurableAI largCountry = MeasurableAI.largest(countries);
        CountryAI ct = (CountryAI)largCountry;
        String  name = ct.getName();
        System.out.println("largest is " + name +" = "+largest);

        double smallest = MeasurableAI.min(countries);
        MeasurableAI smallCountry = MeasurableAI.smallest(countries);
        System.out.printf("smallest is %s = %.1f",
                ((CountryAI)smallCountry).getName(),
                smallest);
    }

    public void test2Country()
    {
        // Calling the average method with an array of Country objects
        MeasurableAI[] countries = new MeasurableAI[3];
        countries[0] = new CountryAI("Uruguay",  176220);
        countries[1] = new CountryAI("Thailand", 513120);
        countries[2] = new CountryAI("Japan",   30510);

        double averageArea = MeasurableAI.average(countries);
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 239950");

        double largest = MeasurableAI.max(countries);
        System.out.print("Largest population="+largest);

        MeasurableAI largCountry = MeasurableAI.largest(countries);
        CountryAI ct = (CountryAI)largCountry;
        String  name = ct.getName();
        System.out.println("(" + name +")");

        double smallest = MeasurableAI.min(countries);
        MeasurableAI smallCountry = MeasurableAI.smallest(countries);
        System.out.printf("smallest is %s = %.1f",
                ((CountryAI)smallCountry).getName(),
                smallest);

        Arrays.sort(countries);
    }

}
