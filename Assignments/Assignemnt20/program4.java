// Write A Program to find the largest digit in a given number...

class Logic
{
    int findLargestDigit(int num)
    {
        int digit = 0;
        int max = 0;

        if(num < 0)
        {
            num = -num;
        }

        while(num != 0)
        {
            digit = num % 10;

            if(digit > max)
            {
                max = digit;
            }

            num = num / 10;
        }
        return max;         // RETURN VALUE here
    }
}

class Program4
{
    public static void main(String [] A) 
    {
        Logic obj = new Logic();
        int iRet = obj.findLargestDigit(843219);

        System.out.println("Largest digit is : " + iRet);
    }
}
