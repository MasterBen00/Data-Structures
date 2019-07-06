import java.util.Scanner;
public class Task13
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
   public static int [] removeOdd(int [] input)
   {
     int even=0;
    for(int i=0;i<input.length;i++)
    {
      if(input[i]%2==0)
      {
        even++;
      }
    }
    int [] evenArray=new int [even];
    int c=0;
    for(int i=0;i<input.length;i++)
    {
      if(input[i]%2==0)
      {
        evenArray[c]=input[i];
        c++;
      }
    }
    return evenArray;
  }
}
