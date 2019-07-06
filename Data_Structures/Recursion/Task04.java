public class Task04
{
  public static void main(String [] args)
  {
        d2b(10); 
        System.out.println();
        System.out.println("End"); 
  }
  
  public static void d2b(int n)
  {    
    if(n>0)
    {
   int x=n/2;
   int s=n%2;
   d2b(x);
   System.out.print(s);
    }  
  }
}