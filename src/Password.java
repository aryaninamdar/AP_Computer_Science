import java.util.Random;

public class Password {
    public static void main(String[] args) {
        passWrdAI();
        Password password = new Password();
        password.dice();
    }


    public static void passWrdAI()
    {
        System.out.println("Password Generator by AI");
        Random rrr = new Random();
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //A to Z
        String digit = "0123456789";
        int count=0;
        while(count < 10)
        {
            String password = "", lowerPW="", upperPW="", digitPW="";
            //qqq: A-L Last name: rewrite with a while loop
            //qqq: M-Z Last name: rewrite with a do while loop
            int i = 0;
            while (i < 4) {
                int index = rrr.nextInt( 26 );
                lowerPW += lower.charAt(index);
                i++;
            }

            //qqq: A-L Last name: rewrite with a do while loop
            //qqq: M-Z Last name: rewrite with a while loop
            int k = 0;
            do {
                int index = rrr.nextInt(10);
                digitPW += digit.charAt(index);
                k++;
            } while (k < 3);

            //qqq: A-L Last name: rewrite with a backward for loop
            //qqq: M-Z Last name: rewrite with a backward while loop
            for (int j = 1; j >= 0; j--) {
                int index = rrr.nextInt( 26 ); //qqq replace 5 with the correct value
                upperPW += upper.charAt(index);
            }

            password = upperPW + lowerPW + digitPW;
            System.out.println("pswd" + count + ": " + password); //output must match terminal example
            count++;
        }
    }

    public void dice() {
        for (int i = 0; i < 10; i++) {
            Random rrr = new Random();
            int dice1;
            int dice2 = 1;
            int maxDice = 6;
            dice1 = rrr.nextInt( maxDice );
            dice1++;
            dice2 += rrr.nextInt( maxDice );
            System.out.println(dice1 + " " + dice2);
        }
    }
}
