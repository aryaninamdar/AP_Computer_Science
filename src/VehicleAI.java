/**
 * UML Class Diagram
 * -------------------------
 *        VehicleAI        |
 * -------------------------
 *  -manufacturer : String |
 *  -year : int            |
 * -------------------------
 *  +getMfr() : String     |
 *  +setMfr( String  )     |
 *  +getYear( ) : int      |
 *  +setYear( int )        |
 * -------------------------
 *
 * @author Aryan Inamdar
 * @version 4/17/21
 */

public class VehicleAI
{
    private String manufacturer;
    private int year;

    public VehicleAI()
    {
        manufacturer = "unknown";
        year = -123;
    }

    public VehicleAI(String mfg, int year)
    {
        this.manufacturer = mfg;
        this.year = year;
    }

    public void setMfg(String mfg)
    {
        manufacturer = mfg;
    }

    public String getMfg( )
    {
        return manufacturer;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

}
