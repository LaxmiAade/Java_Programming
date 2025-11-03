// WAP to check a number is Positive, Negative or Zero

class logic
{
    void CheckPosNegZero(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println("The number is Positive");
        }
        else
        {
            if(iNo < 0)
            {
                System.out.println("The number is Negative");
            }
            else
            {
                System.out.println("The number is Zero");
            }
        }

    }

}

class program5
{
    public static void main(String args[])
    {
        logic obj = new logic();
        obj.CheckPosNegZero(0);

    }
}