public class Date
{
  public int day;
  public int month;
  public int year;
  public Date(int d, int m, int y)
  {
    day=d;
    month=m;
    year=y;
  }
  public void setDay(int d)
  {
    day=d;
  }
  public int getDay()
  {
    return day;
  }
  public void setMonth(int m)
  {
    month=m;
  }
  public int getMonth()
  {
    return month;
  }
  public void setYear(int y)
  {
    year=y;
  }
  public int getYear()
  {
    return year;
  }
  public void displayDate()
  {
    System.out.println(day+"/"+month+"/"+year);
  }
}