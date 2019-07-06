import java.util.Scanner;
public class Task07
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int [] a=new int [10];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter another number for choosing array cell");
    int x=sc.nextInt();
    for(int i=0;i<a[x];i++)
    {
      System.out.print("*");
    }
    System.out.println();
  }
}