import java.util.Scanner;
public class Task12
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    boolean k=before(a,b,c,d);
    System.out.println(k);
  }
  public static boolean before(int m,int n,int m1,int n1)
  {
    if(m<m1)
    {
      return true;
    }
    else if(m>m1)
    {
      return false;
    }
    else if(n<n1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
