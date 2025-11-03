// Write a Program to Calculate the product of digits of a Number....


class Logic
{
    int productOfDigits(int num)
    {
        int digit = 0;
        int product = 1;

        if(num < 0)        // updater
        {
            num = -num;
        }

        while(num != 0)
        {
            digit = num % 10;      // extract digit
            product = product * digit;   // multiply
            num = num / 10;        // remove digit
        }

        return product;
    }
}

class Program1
{
    public static void main(String [] A)
    {
        Logic obj = new Logic();
        int iRet = obj.productOfDigits(523);

        System.out.println("Product of digits is : " + iRet);
    }
}
