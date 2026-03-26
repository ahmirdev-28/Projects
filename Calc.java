public class Calc
{
    private double num1;
    private double num2;

    public Calc()
    {
        num1 = 0;
        num2 = 0;
    }

    public void setNum1(double n)
    {
        num1 = n;
    }

    public void setNum2(double n)
    {
        num2 = n;
    }

    public double getNum1()
    {
        return num1;
    }

    public double getNum2()
    {
        return num2;
    }

    public double add()
    {
        return num1 + num2;
    }

    public double subtract()
    {
        return num1 - num2;
    }

    public double multiply()
    {
        return num1 * num2;
    }

    public double divide()
    {
        return num1 / num2;
    }

    public String toString()
    {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }
}