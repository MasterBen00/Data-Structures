import java.util.Scanner;
public class PointUser
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the point");
    int a=sc.nextInt();
    int b=sc.nextInt();
    Point p=new Point(a,b);
    System.out.println(p.distanceFromOrigin());
  }
}