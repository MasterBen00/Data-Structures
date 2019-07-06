import java.util.Scanner;
public class Task01
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int [] a=new int[5];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Enter number");
      a[i]=sc.nextInt();
    }
    boolean b;
      if(a[0]==6 || a[a.length-1]==6)
      {
        b=true;
          System.out.println(b);
      }
      else
      {
        b=false;
        System.out.println(b);
      }
  }
}