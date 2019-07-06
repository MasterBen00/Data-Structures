import java.util.Scanner;
public class Task04
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of Array");
    int n=sc.nextInt();
    int [] a= new int[n];
    int [] b= new int[n];
    int [] c= new int[n];
    System.out.println("Enter first Array");
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter second Array");
    for(int i=0;i<n;i++)
    {
      b[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      c[i]=5*a[i]-b[i];
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(c[i]+" ");
    }
    System.out.println();
  }
}