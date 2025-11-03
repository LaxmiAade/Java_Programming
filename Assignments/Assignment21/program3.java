// Write a Program to display of all factors of a given Numbers

// Write a Program to display all factors of a given Number

import java.util.*;

class Logic
{
    void displayFactors(int num)
    {
        if(num < 0)         // updater
        {
            num = -num;
        }

        System.out.print("Factors are : ");
        for(int i = 1; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.print(num);   // number itself is always a factor
    }
}

class Program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        Logic obj = new Logic();
        obj.displayFactors(iValue);
    }
}
