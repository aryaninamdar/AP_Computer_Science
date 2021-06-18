/**
 *
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

public class ClientNxNAI {
    public static void main(String[] args) {
        ClientNxNAI clientNxNAI = new ClientNxNAI();
        clientNxNAI.solve3x3();
        clientNxNAI.solve4x4();
    }

    public void solve3x3() {
        NxNAI nxNAI = new NxNAI(3);
        nxNAI.shake();
        int tries = 0;
        int sum = 0;
        while (true) {
            if ((nxNAI.addRow(1) == nxNAI.addRow(2)) && (nxNAI.addRow(1) == nxNAI.addRow(3)) && (nxNAI.addRow(1) == nxNAI.addColumn(1)) && (nxNAI.addRow(1) == nxNAI.addColumn(2)) &&
                    (nxNAI.addRow(1) == nxNAI.addColumn(3)) && (nxNAI.addRow(1) == nxNAI.addDiagonal1()) && (nxNAI.addRow(1) == nxNAI.addDiagonal2())) {
                break;
            }
            else {
                tries++;
                nxNAI.shake();
            }
        }
        sum  = nxNAI.addRow(1);
        nxNAI.printMe();
        System.out.println("Aryan Inamdar got it: " + tries + " tries, " + "sum = " + sum);
    }

    public void solve4x4() {
        NxNAI nxNAI = new NxNAI(4);
        nxNAI.shake();
        int tries = 0;
        int sum = 0;
        while (true) {
            if ((nxNAI.addRow(1) == nxNAI.addRow(2)) && (nxNAI.addRow(1) == nxNAI.addRow(3)) && (nxNAI.addRow(1) == nxNAI.addRow(4)) && (nxNAI.addRow(1) == nxNAI.addColumn(1)) &&
                    (nxNAI.addRow(1) == nxNAI.addColumn(2)) && (nxNAI.addRow(1) == nxNAI.addColumn(3)) && (nxNAI.addRow(1) == nxNAI.addColumn(4)) &&
                    (nxNAI.addRow(1) == nxNAI.addDiagonal1()) && (nxNAI.addRow(1) == nxNAI.addDiagonal2())) {
                break;
            }
            else {
                tries++;
                nxNAI.shake();
            }
        }
        sum  = nxNAI.addRow(1);
        nxNAI.printMe();
        System.out.println("Aryan Inamdar got it: " + tries + " tries, " + "sum = " + sum);
    }
}
