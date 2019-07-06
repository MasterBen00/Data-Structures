import java.util.Scanner;
public class Task15
{
  public static void main(String [] args)
  {
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");     
    }
    System.out.println();
  }
    public static int [] removeOdd (int [] a)
    {
      int even=0;
      for(int i=0;i<a.length;i++)
      {
        if(a[i]%2==0)
        {
          even++;
        }
      }
      int [] b=new int[even];
      int k=0;
      for(int i=0;i<a.length;i++)
      {
        if(a[i]%2==0)
         {
           b[k]=a[i];
           k++;
      }
      }
      return b;
    }
}
        
       