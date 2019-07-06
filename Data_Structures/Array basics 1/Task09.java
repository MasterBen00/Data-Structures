import java.util.Scanner;
public class Task09
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int [] a=new int[10];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    DisplayArray(a);
    DisplaySquareArray(a);
  }
    public static void DisplayArray(int [] b)
    {
      for(int c=0;c<b.length;c++)
      {
        System.out.print(b[c]);
        System.out.print(",");
      }
      System.out.println();
    }
    public static void DisplaySquareArray(int [] b)
    {
      for(int c=0;c<b.length;c++)
      {
        System.out.print(b[c]*b[c]);
        System.out.print(",");
      }
      System.out.println();
    }
  }

        