// Write a Program to print all numbers from 1 to N that are divisible by both 2 and 3....


import java.util.*;

class Logic
{
    void displayDivisibleBy2and3(int num)
    {
        if(num < 0)      // updater for negative input
        {
            num = -num;
        }

        System.out.println("Numbers divisible by both 2 and 3 are : ");

        for(int i = 1; i <= num; i++)
        {
            if(i % 2 == 0 && i % 3 == 0)   // divisible by both
            {
                System.out.print(i + " ");
            }
        }
    }
}

class Program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int iValue = sobj.nextInt();

        Logic obj = new Logic();
        obj.displayDivisibleBy2and3(iValue);
    }
}
