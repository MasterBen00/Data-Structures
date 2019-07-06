public class Square
{
  double height,width,area;
  public void setHeight(double h)
  {
    height=h;
  }
    public double getHeight()
    {
      return height;
    } 
  public void setWidth (double w)
  {
    width=w;
  }
   public double getWidth()
   {
     return width;
   }
  public double getArea()
  {
    area=height*width;
    return area;
  }
}
