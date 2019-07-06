import java.util.Scanner;
public class Task09
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number not greater than ten");
    int n=sc.nextInt();
    int [] a = {1,4,8,16,25,36,49,64,81,10};
    int [] tmp=new int[n];
    for(int i=0;i<tmp.length;i++)
    {
      tmp[i]=a[i];
    }
    for(int i=0;i<=a.length-n-1;i++)
    {
      a[i]=a[i+n];
    }
    int c=a.length-1;
    int k=n-1;
    for(int i=0;i<n;i++)
    {
      a[c]=tmp[k];
      c--;
      k--;
    }
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
}
    