/**
 *
 * @author Aryan Inamdar
 * @version 4/3/21
 */

import java.util.Arrays;
import java.util.Random;
import java.text.DecimalFormat;

public class BJE07cAI {
    public static void main(String[] args) {
        BJE07cAI bje07cAI = new BJE07cAI();
        bje07cAI.gpa();
        bje07cAI.makeInitials();
        bje07cAI.dogKennel();
    }

    public void gpa() {
        Random nn = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        double[] gpa = new double[1000];
        // with for loop create a new random GPA 1000 times
        for (int index = 0; index < gpa.length; index++) { // helps the loop progress instead of being infinite (rewritten)
            double oneGPA = nn.nextDouble() * 4.00;
            oneGPA = Math.round(oneGPA * 100.0) / 100.0;
            gpa[index] = oneGPA; // assign the random GPA to the list in progressing position/order
        }
        System.out.println(Arrays.toString(gpa)); // print array method
    }

    public void makeInitials() {
        Random nn = new Random();
        String[] initials = new String[100];
        String letters = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        int index = initials.length - 1;
        while (index >= 0) { // backward while loop
            int posF = nn.nextInt(letters.length());
            int posL = nn.nextInt(letters.length());
            String first = letters.substring(posF, posF + 1);
            String last = letters.substring(posL, posL + 1);
            initials[index] = first + last;
            index--; // decreases index after every iteration
        }
        System.out.println(Arrays.toString(initials)); // print array method
    }

    public void dogKennel() {
        Random abc = new Random();
        String[] kennel = new String[10];
        int k = 0;
        // my last name is F-K so I am doing a while loop from the first to last element
        while (k < kennel.length) {
            int id = abc.nextInt(9999 - 1000) + 1000;
            double weight = 1000.0 + (9999.0 - 1000.0) * abc.nextDouble();
            weight = Math.round(weight * 100.0) / 100.0;
            DogAI dog = new DogAI(id, weight);
            String eachDog = ("Dog " + (k + 1) + ": ID is " + dog.getID() + " and weight is " + dog.getWeight() + "\n"); // using public interface methods
            kennel[k] = (eachDog);
            k++;
        }
        System.out.println(Arrays.toString(kennel)); // print array method
    }
}
