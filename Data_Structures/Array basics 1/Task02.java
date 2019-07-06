import java.util.Scanner;
public class Task02
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
      int max=0;
      int min=0;
      int maxIndex=0;
      int minIndex=0;
    for(int c=0;c<a.length;c++)
    {
      if(max > a[c])
      {
        max=a[c];
        maxIndex=c;
      }
      else
      {
        if(min < a[c])
        {
          min=a[c];
          minIndex=c;
        }
      }
    }
      int temp;
      temp=a[maxIndex];
      a[maxIndex]=a[minIndex];
      a[minIndex]=temp;
       for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]);
      System.out.print(",");
    }
        System.out.println();
  }
}
    
  