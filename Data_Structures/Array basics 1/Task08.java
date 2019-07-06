import java.util.Scanner;
public class Task08
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array length");
    int x=sc.nextInt();
    int [] a=new int[x];
    int [] b=new int[x];
    int [] c=new int[x];
    for(int i=0;i<x;i++)
    {
      System.out.println("Enter first array");
      a[i]=sc.nextInt();
    }
    for(int i=0;i<x;i++)
    {
      System.out.println("Enter second array");
      b[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
      c[i]=5*a[i]-b[i];
    }
    for(int i=0;i<x;i++)
    {
      System.out.print(c[i]+",");
    }
    System.out.println();
  }
}