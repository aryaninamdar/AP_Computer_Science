/**
 *
 * @author Aryan Inamdar
 * @version 4/17/21
 */

import java.util.Random;

public class ClientAI {
    public static void main(String[] args) {
        ClientAI clientAI = new ClientAI();
        clientAI.testBike();
    }

    private CarAI2[] autoZone;
    private BicycleAI[] ivc;

    public void test1(int size) {
        Random random = new Random();
        autoZone = new CarAI2[size];
        int i = 0;
        do {
            String license = random.nextInt(100) + 10 + "ABC";
            double mpg = random.nextDouble() * 45;
            CarAI2 realCar = new CarAI2(license, mpg);
            i++;
        } while (i < size);
    }

    public void printMe() {
        for (BicycleAI bike: ivc) {
            System.out.println("Type Code: " + bike.getTypeCode() + "; Gender: " + bike.getGender());
        }
    }

    public void betterPrintMe() { // using better accessor methods
        for (BicycleAI bike: ivc) {
            System.out.println("Type Code: " + bike.getTypeCode() + "; Gender: " + bike.getGender());
        }
    }

    public void testBike() {
        Random random = new Random();
        BicycleAI sis = new BicycleAI(2, 2); // girl's road bike
        BicycleAI bro = new BicycleAI(3, 1); // boy's mountain bike
        ivc = new BicycleAI[10];
        for (int i = 0; i < ivc.length; i++) {
            ivc[i] = new BicycleAI((random.nextInt(4) + 1), (random.nextInt(3) + 1));
        }
        betterPrintMe();
    }
}
