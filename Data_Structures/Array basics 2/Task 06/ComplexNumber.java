public class ComplexNumber
{
    public int realPart=0;
    public int imaginaryPart=0;
    public ComplexNumber(int r, int i)
   {
    realPart=r;
    imaginaryPart=i;
   }
    public void increaseValue()
    {
      realPart+=2;
      imaginaryPart+=2;
    }
    public double polarRadius()
     {
       double cal=Math.pow(realPart,2)+Math.pow(imaginaryPart,2);
       cal=Math.sqrt(cal);
       return cal;
     }
   public String toString()
   {
    return realPart+" +i"+imaginaryPart;
   }
}