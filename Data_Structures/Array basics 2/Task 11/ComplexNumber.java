public class ComplexNumber extends RealNumber
{
    private double imaginaryValue;
    public void setImaginaryValue(double v)
    {
        imaginaryValue = v;
    }
    public double getImaginaryValue()
    {
        return imaginaryValue;
    }
    public ComplexNumber()
    {
        super(1.0);
        setImaginaryValue(1.0);
    }
    public ComplexNumber(double m, double n)
    {
        super(m);
        setImaginaryValue(n);
    }
    public String toString()
    {
        return super.toString()+ "\nImaginaryPart: "+ getImaginaryValue();
    }
    public void check()
    {
        System.out.println("I am in ComplexNumber class");
        ping();
        System.out.println("Checking ended.");
    }
}