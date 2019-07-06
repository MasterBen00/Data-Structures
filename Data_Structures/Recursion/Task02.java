public class Task02
{
  public static void main(String [] args)
  {
    int num=fib(6);
    System.out.println(num);
    
  }
  
  public static int fib(int n)
  {
    if(n==0 || n==1)
    {
      return n;
    }
    return fib(n-1)+fib(n-2);
  }
}