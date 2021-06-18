import java.util.Arrays;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        lendMoneyAI();
    }

    public static void pgm0149AI()
    {
        int[] numbers = new int[9];

        System.out.println("Array0149 by Aryan Inamdar"); //title
        int k = 0;
        while(k < 9)
        {
            if ((k + 1) % 2 == 0) {
                numbers[k] = (k + 1) * (k + 1);
            }
            else {
                numbers[k] = -(k + 1) * (k + 1);
            }
            k++;
        }

        System.out.print("Array is ");
        for( int i = 0; i < numbers.length; i++ )
        {
            if (i != 8) {
                System.out.print(numbers[i] + ", ");
            }
            else {
                System.out.print(numbers[i]);
            }
        }

        int sum = 0;
        for( int num: numbers ) //must use for-each loop
        {
            sum += num;
        }
        System.out.println("\nsum = " + sum);
    }

    public static void lendMoneyAI()
    {
        Random rd = new Random();
        //LEND + MORE = MONEY
        int L,E,N,D,M,O,R,Y;
        int lend,more,money;
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        int count = 0;
        System.out.println("AI's Lend More Money");
        // I have last Name "I" so I will count from 0 to 3000000 with while loop
        while (count < 3000000) {
            //qqq scramble the num array by swapping 2 elements
            int i=rd.nextInt( 10 ); //QQQ replace 5 with correct value
            int j=rd.nextInt( 10 ); //QQQ replace 5 with correct value
            int tmp = num[i];
            //QQQ swap the two elements
            num[i] = num[j];
            num[j] = tmp;

            //Start assigning the elements of num to the letters.
            L=num[0]; E=num[1]; N=num[2]; D=num[3];
            M=num[4]; O=num[5]; R=num[6]; Y=num[7];

            //qqq compute LEND, MORE, MONEY
            lend=L*1000+E*100+N*10+D;  //QQQ correct this statement
            more=M*1000+O*100+R*10+E; //QQQ correct this statement
            money=M*1000+O*100+N*10+E+Y; //QQQ correct this statement

            //qqq check if LEND+MORE equals MONEY?
            if(lend+more == money) //QQQ correct this statement
            {
                System.out.println(count + "tries: " + lend + " + " + more + " = " + money);
                System.out.println(Arrays.toString(num)+"\n"); //QQQ don't forget import java.util.Arrays

            }
            count++;
        }
    }
}
