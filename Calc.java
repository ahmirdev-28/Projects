public class Calc
{
    // private data fields
    private double num1;
    private double num2;

    // constructor
    public Calc()
    {
        num1 = 0;
        num2 = 0;
    }

    // set methods
    public void setNum1(double num1)
    {
        this.num1 = num1;
    }

    public void setNum2(double num2)
    {
        this.num2 = num2;
    }

    // get methods
    public double getNum1()
    {
        return num1;
    }

    public double getNum2()
    {
        return num2;
    }

    // math methods
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

    // toString method
    public String toString()
    {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }
}