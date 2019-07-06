import java.util.Scanner;
public class Task10
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Month");
    int a=sc.nextInt();
    System.out.println("Enter Day");
    int b=sc.nextInt();
    String s=Season(a,b);
    System.out.println(s);
  }
   public static String Season(int m, int n)
   {
     String k="";
     if((m==12 && n>=16)|| (m==1&& n>=1&&n<=31)||(m==2&&n>=1&&n<=31 )||(m==3 && n<=15))
    {
      k="Winter";
    }
    else if((m==3 && n>=16)|| (m==4&& n>=1&&n<=31)||(m==5&&n>=1&&n<=31 )||(m==6 && n<=15))
    {
      k="Spring";
    }
    else if((m==6 && n>=16)|| (m==7&& n>=1&&n<=31)||(m==8 &&n>=1&&n<=31 )||(m==9 && n<=15))
    {
      k="Summer";
    }
    else if((m==9 && n>=16)||( m==10 &&n>=1&&n<=31)||(m==11&&n>=1&&n<=31) ||(m==12 && n<=15))
    {
      k="Fall";
    }
    return k;
   }
}