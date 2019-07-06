public class Task01
{
    public static void main(String [] args)
    {
        ArrayQueue br=new ArrayQueue();
        System.out.println("--------Dr Chamber using Array Queue --------");
        try
        {
            Object obj=br.ServePatient();
            System.out.println(obj);
        }
        catch(Exception e)
        {
            System.out.println("No Patient left");
        }
        try{
            System.out.println("can doctor go home ? - "+ br.CanDoctorGoHome());
            br.RegisterPatient(10);
            br.RegisterPatient(20);
            br.RegisterPatient(30);
            br.RegisterPatient(40);
            br.RegisterPatient(50);
            System.out.println("can doctor go home ? - "+ br.CanDoctorGoHome());
            System.out.println("show all patient "+ br.ShowAllPatient());
            br.CancellAll();
            System.out.println("can doctor go home ? - "+ br.CanDoctorGoHome());
        }
        catch(Exception e)
        {

        }

    }
}
