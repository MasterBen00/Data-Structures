public class BankAccount
{
   String name,address,accountID; 
   double balance;
    public BankAccount()
  {
  }
  public BankAccount(String n, String i, String a, Double b)
  {
    name=n;
    accountID=i;
    address=a;
    balance=b;
  }
  public void setName(String n)
  {
    name=n;
  }    
  public String getName()
  {
    return name;
  }
  public void setAccountID(String i)
  {
    accountID=i;
  }
    public String getAccountID()
  {
    return accountID;
  }
  public void setAddress(String a)
  {
    address=a;
  }
    public String getAddress()
  {
    return address;
  }
  public void setBalance(double c)
  {
    balance=c;
  }
    public double getBalance()
  {
    return balance;
  }
  public void addInterest()
  {
    balance=balance+(balance*0.07);
  }
}