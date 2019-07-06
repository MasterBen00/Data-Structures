import java.util.Scanner;
public class Task04
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int [] a=new int [10];
    System.out.println("Enter "+a.length+" different numbers");
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
      for(int c=0;c<i;c++)
      {
        if(a[c]==a[i])
        {
          System.out.println("Enter different number");
          i--;         
        }
      }
    }
  }
}