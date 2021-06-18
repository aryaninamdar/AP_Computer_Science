/**
 *
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

import java.util.Random;
public class DiceGameAI
{
    public static void main(String[] args) {
        DiceGameAI diceGameAI = new DiceGameAI();
        diceGameAI.play();
    }

    private DicePairAI dice;
    private int[] score;

    public DiceGameAI()
    {
        dice = new DicePairAI();
        score = new int[20];
    }

    // all accessors
    public void printArray()
    {
        for(int i = 0; i < 20; i++)
        {
            System.out.print(score[i] + " ");

            if((i + 1) % 5 == 0 && i + 1 < 20)
            {
                System.out.print("- ");
            }
        }
        System.out.println();
    }

    // method to play game
    public void play()
    {
        score = new int[20];
        dice.roll();
        score[0] = dice.getTotal();

        if(score[0] == 7 || score[0] == 11)
        {
            System.out.print("You win: ");
            printArray();
        }
        else if(score[0] == 2 || score[0] == 3 || score[0] == 12)
        {
            System.out.print("You lose: ");
            printArray();
        }
        else
        {
            int goal = score[0];
            int i = 1;
            char winLoss = 'a';

            while(i < 20 && winLoss == 'a')
            {
                dice.roll();
                score[i] = dice.getTotal();
                if(score[i] == goal)
                {
                    winLoss = 'w';
                }
                else if(score[i] == 7)
                {
                    winLoss = 'l';
                }
                i++;
            }

            if(winLoss == 'w')
            {
                System.out.print("You win: ");
            }
            else if(winLoss == 'l')
            {
                System.out.print("You lose: ");
            }
            else if(winLoss == 'a' && i == 20)
            {
                System.out.print("Out of rolls: ");
            }

            printArray();
        }
    }

}

