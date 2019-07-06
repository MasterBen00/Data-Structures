import java.util.Scanner;
public class ComplexNumberUser
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Real part of the complex number");
    int a=sc.nextInt();
    System.out.println("Enter Imaginary part of the complex number");
    int b=sc.nextInt();
    ComplexNumber c=new ComplexNumber(a,b);
    System.out.println(c);
    c.increaseValue();
    System.out.println(c.toString());
    System.out.println(c.polarRadius());
  }
}