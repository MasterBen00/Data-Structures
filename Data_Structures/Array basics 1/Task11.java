import java.util.Scanner;
public class Task11
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter a positive integer");
   int x=sc.nextInt();
   boolean b=allDigitsOdd(x);
   System.out.println(b);
  }
  public static boolean allDigitsOdd(int a)
  {
    boolean d=false;
    int digit=0;    
    String s=String.valueOf(a);
    int n=a;
    for(int i=0;i<s.length();i++)
    {
      digit=n%10;
      n=n/10;
      if(digit%2==0)
      {
        d=false;
        break;
      }
      else {
        d=true;
      }
    }
      return d;
    }
}
    