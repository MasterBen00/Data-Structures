public class Point
{
  public int x,y=0;
  public Point(int a,int b)
  {
    x=a;y=b;
  }
  public double distanceFromOrigin()
  {
    double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    return distance;
  }
  }