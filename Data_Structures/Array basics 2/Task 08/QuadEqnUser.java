import java.util.Scanner;
public class QuadEqnUser
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    QuadEqn q = new QuadEqn(a,b,c);
    System.out.println(q.printEqn());
    q.root();
  }
}