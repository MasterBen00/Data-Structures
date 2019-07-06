import java.util.Scanner;
public class Task03
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
      int temp=0;
      for(int i=0;i<a.length-1;i++)
      {
        for(int c=0;c<a.length-i-1;c++)
        {
          if(a[c]>a[c+1])
          {
            temp=a[c];
            a[c]=a[c+1];
            a[c+1]=temp;
          }
        }
      }
        for(int k=0;k<a.length;k++)
        {
          System.out.print(a[k]);
          System.out.print(",");
        }
         for(int j=0;j<a.length;j++)
         {
           if(a[j]%2==0)
           {
              System.out.print(a[j]);
          System.out.print(",");
           }
        }
        System.out.println();
      }
  }
          
