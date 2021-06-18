// @author Aryan Inamdar
// @version 01-23-20

import javax.swing.JOptionPane;

public class EOC01aHW {
    public static void main(String[] args) {
        EOC01aHW exercises = new EOC01aHW();
        exercises.E1_7();
        exercises.E1_9();
        exercises.E1_11();
        exercises.E1_13();

        // E1_15
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("\n\nE1_15 Output: ");
        System.out.println("Hello, " + name);
    }

    public void E1_7() {
        System.out.println("E1_7 Output: ");
        System.out.println(" +-----+ ");
        System.out.println("(| O O |)");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
    public void E1_9() {
        System.out.println("\n\nE1_9 Output: ");
        System.out.println("   +   ");
        System.out.println("  + +  ");
        System.out.println(" +   + ");
        System.out.println("+-----+");
        System.out.println("| .-. |");
        System.out.println("| | | |");
        System.out.println("+-+-+-+");
    }
    public void E1_11() {
        System.out.println("\n\nE1_11 Output: ");
        System.out.println("Avengers");
        System.out.println("Batman");
        System.out.println("Jurassic Park");
    }
    public void E1_13() {
        System.out.println("\n\nE1_13 Output: ");
        System.out.println("* * * * * * ===============================");
        System.out.println(" * * * * *  ===============================");
        System.out.println("* * * * * * ===============================");
        System.out.println(" * * * * *  ===============================");
        System.out.println("* * * * * * ===============================");
        System.out.println(" * * * * *  ===============================");
        System.out.println("* * * * * * ===============================");
        System.out.println(" * * * * *  ===============================");
        System.out.println("* * * * * * ===============================");
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("===========================================");
    }
}
