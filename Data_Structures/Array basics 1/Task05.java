import java.util.Scanner;
public class Task05
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int [] a=new int [15];
    System.out.println("Enter "+a.length+" different numbers");
    for(int i=0;i<a.length;i++)
    {
      int x=sc.nextInt();
      a[x]=a[x]+1;
    }
     for(int i=0;i<10;i++)
    {
     System.out.println(i+" was found "+a[i]+" times");
     }
  }
}