// Write a Program which count how many even odd numbers are present between 1 to N....

import java.util.*;

class Logic
{
    void countEvenOdd(int N)
    {
        int EvenCount = 0;
        int OddCount = 0;

        if(N < 0)          // updater
        {
            N = -N;
        }

        for(int i = 1; i <= N; i++)
        {
            if(i % 2 == 0)
            {
                EvenCount++;
            }
            else
            {
                OddCount++;
            }
        }

        System.out.println("Even Numbers Count : " + EvenCount);
        System.out.println("Odd Numbers Count  : " + OddCount);
    }
}

class Program2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int iValue = sobj.nextInt();

        Logic obj = new Logic();
        obj.countEvenOdd(iValue);
    }
}
