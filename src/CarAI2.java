/**
 * UML Class Diagram
 * --------------------------
 *        CarAI2             |
 * --------------------------
 *  -license : String       |
 *  -milesPerGal : double   |
 * --------------------------
 *  +getMpg() : double      |
 *  +setLicense( String )   |
 *  +getLicense( ) : String |
 *  +setMpg( double )       |
 * --------------------------
 *
 * @author Aryan Inamdar
 * @version 4/17/21
 */

public class CarAI2 extends VehicleAI
{
    private String license;
    private double milesPerGal;

    public CarAI2()
    {
        license = "";
        milesPerGal = 0;
    }

    public CarAI2(String license, double mpg)
    {
    }


    public void setLicense(String license)
    {
        this.license = license;
    }

    public void setMpg(double mpg)
    {
        milesPerGal = mpg;
    }

}
