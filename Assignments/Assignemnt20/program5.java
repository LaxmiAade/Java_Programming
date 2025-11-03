// Write A Program to find the Smallest digit in a given number...

class Logic
{
    int findSmallestDigit(int num)
    {
        int digit = 0;
        int min = 9;        

        if(num < 0)                           // updater
        {
            num = -num;
        }

        while(num != 0)
        {
            digit = num % 10;

            if(digit < min)
            {
                min = digit;                // store smallest digit
            }

            num = num / 10;
        }

        return min;
    }
}

class Program5
{
    public static void main(String [] A) 
    {
        Logic obj = new Logic();
        int iRet = obj.findSmallestDigit(843219);
        
        System.out.println("Smallest digit is : " + iRet);
    }
}
