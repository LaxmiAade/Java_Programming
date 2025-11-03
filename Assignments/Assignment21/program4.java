// Write a Program to count total number of factorsof a given Number ...


import java.util.*;

class Logic
{
    int countFactors(int num)
    {
        int count = 0;

        if(num < 0)      // updater
        {
            num = -num;
        }

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }

        return count;
    }
}

class Program4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        Logic obj = new Logic();
        int iRet = obj.countFactors(iValue);

        System.out.println("Total number of factors are : " + iRet);
    }
}
