public class Task03
{
  public static void main(String []args)
  {
    BankAccount acc1=new BankAccount("Beniamin","1234","b30",9999.00);
    BankAccount acc2=new BankAccount("Ben","1233","b40",99999.00);
    BankAccount acc3=new BankAccount();
    acc3.setName("Master");
    acc3.setAccountID("1232");
    acc3.setAddress("b50");
    acc3.setBalance(999999.00);
    acc1.addInterest();
    acc3.addInterest();
    System.out.println("Name:"+ acc1.getName()+"\n ID:"+acc1.getAccountID()+"\n Address:"+acc1.getAddress()+"\n Balance:"+acc1.getBalance() );
    System.out.println("Name:"+ acc2.getName()+"\n ID:"+acc2.getAccountID()+"\n Address:"+acc2.getAddress()+"\n Balance:"+acc2.getBalance() );
    System.out.println("Name:"+ acc3.getName()+"\n ID:"+acc3.getAccountID()+"\n Address:"+acc3.getAddress()+"\n Balance:"+acc3.getBalance ());
  }
}