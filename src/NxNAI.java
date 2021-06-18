/**
 * Write a description of class NxNAI here.
 *
 * @author Aryan Inamdar
 * @version 05-02-21
 */

import java.util.Random;
import java.util.Arrays;

public class NxNAI
{
    int n;
    int[][] numArr; // My last name is I

    // Constructors
    public NxNAI(int num)
    {
        numArr = new int[num][num];
        n = 1;
        for(int i = 0; i < num; i++)
        {
            for(int j = 0; j < num; j++)
            {
                numArr[i][j] = n;
                n++;
            }
        }
        n = num;
    }

    // all accessors
    public String toString()
    {
        String numStr = "";
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                numStr += String.format("%3d", numArr[i][j]);
            }
            numStr += "\n";
        }
        return numStr;
    }

    public void printMe()
    {
        System.out.println(toString());
    }

    public int addRow(int row)
    {
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += numArr[row - 1][i];
        }
        return sum;
    }

    public int addColumn(int col)
    {
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += numArr[i][col - 1];
        }
        return sum;
    }

    public int addDiagonal1()
    {
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += numArr[i][i];
        }
        return sum;
    }

    public int addDiagonal2()
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += numArr[i - 1][n - i];
        }
        return sum;
    }

    // all mutators
    public void shake()
    {
        Random rand = new Random();

        int nn = n * n;
        int[] nums1D = new int[nn];
        int[] numArr1D = new int[nn];
        int pos = 1;
        for(int i = 0; i < nn; i++)
        {
            nums1D[i] = pos;
            pos++;
        }

        for(int i = 0; i < nn; i++)
        {
            pos = rand.nextInt(nn - i); // randomize pos to "shake"
            numArr1D[i] = nums1D[pos];
            nums1D[pos] = 0;
            for(int j = 0; j < nn - 1; j++)
            {
                if(nums1D[j] == 0)
                {
                    for(j = j; j < nn - 1; j++)
                    {
                        nums1D[j] = nums1D[j + 1];
                    }
                }
            }
        }

        pos = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                numArr[i][j] = numArr1D[pos];
                pos++;
            }
        }
    }
}
