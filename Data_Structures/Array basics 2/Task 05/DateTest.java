public class DateTest
{
  public static void main(String [] args)
  {
    Date d=new Date(27,9,2016);
    d.displayDate();
    d.setDay(7);
    d.setMonth(8);
    d.setYear(1995);
    d.displayDate();
  }
}