public class Task06
{
  public static void main(String [] args)
  {
        int a=linearFashion(4,3); 
        System.out.println(a);
  }
  
  public static int linearFashion(int m, int n)
  {    
    if(n==0)
    {
      return 1;
    }
    return m*linearFashion(m,n-1);
  }
}