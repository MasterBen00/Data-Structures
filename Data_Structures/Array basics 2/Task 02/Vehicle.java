public class Vehicle
{
  int x=0;
  int y=0;
  public void moveUp()
  {
  y++;
  }
  public void moveLeft()
  {
    x--;
  }
  public void moveDown()
  {
    y--;
  }
  public void moveRight()
  {
    x++;
  }
  public String toString()
  {
    return "("+x+","+y+")";
}
  
}

                       