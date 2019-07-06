public class QuadEqn
{
  public int a,b,c=0;
  public QuadEqn(int p,int q,int r)
  {
    a=p;b=q;c=r;
  }
  public String printEqn()
  {
    return a+"x2+"+b+"x+"+c;
  } 
  public void root()
  {
    double r=(-(b)+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
    System.out.println(r);
  }
}