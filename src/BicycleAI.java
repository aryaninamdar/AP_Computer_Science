/**
 * UML Class Diagram
 * ------------------------------------------------
 *                     BicycleYI                  |
 * ------------------------------------------------
 *  -typeCode : int 1=folding, 2=road,            |
 *                  3-mountain, 4-cruiser         |
 *  -gender : int ex 1=boy, 2=girl, 3=both             |
 *  -gears : int ex 1-21                          |
 * ------------------------------------------------
 *  +getTypeCode() : String                       |
 *  +setTypeCode( String )                        |
 *  +getGender( ) : int                           |
 *  +setGender( int )                             |
 *  +getGears( ) : int                            |
 *  +setGears( int )                              |
 * ------------------------------------------------
 *
 * @author Aryan Inamdar
 * @version 4/17/21
 */

public class BicycleAI extends VehicleAI
{
    //instance variables
    private int typeCode;
    private int gender;

    //constructor
    public BicycleAI() {
        typeCode = 0;
        gender = 0;
    }

    public BicycleAI(int typeCode, int gender) {
        this.typeCode = typeCode;
        this.gender = gender;
    }

    //accessors and mutators
    public String getTypeCode() {
        String msg = "";
        if (typeCode == 1) {
            msg = "Folding";
        }
        else if (typeCode == 2) {
            msg = "Road";
        }
        else if (typeCode == 3) {
            msg = "Mountain";
        }
        else if (typeCode == 4) {
            msg = "Cruiser";
        }
        return msg;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public String getGender() {
        String msg = "";
        switch (gender) {
            case 1:
                msg = "Boy";
                break;
            case 2:
                msg = "Girl";
                break;
            case 3:
                msg = "Unisex";
                break;
            default:
        }
        return msg;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
