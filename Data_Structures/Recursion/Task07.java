public class Task07
{
  public static void main(String [] args)
  {
        int a=linearFashion(4,2); 
        System.out.println(a);
  }
  
  public static int linearFashion(int m, int n)
  {    
    if(n==0)
    {
      return 1;
    }
    else if(n%2==0)
    {
    return linearFashion(m,n/2)*linearFashion(m,n/2);
    }
    else
    {
      return linearFashion(m,n/2)*linearFashion(m,n/2)*m;
    }
  }
}