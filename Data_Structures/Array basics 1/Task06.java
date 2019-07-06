import java.util.Scanner;
public class Task06
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array length");
    int c=sc.nextInt();
    int [] a=new int [c];
    for(int i=0;i<c;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int k=0;k<a.length/2;k++)
    {
      if(a[k]!=a[a.length-k-1])
      {
        System.out.println("This Array is not a palindrome");
        break;
      }   
    else
    {
      System.out.println("This Array is a palindrome");
      break;
    }
    }
  }
}
    
        