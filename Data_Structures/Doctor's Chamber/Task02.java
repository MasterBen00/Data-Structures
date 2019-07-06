public class Task02 {
    public static void main(String [] args){
        System.out.println("--------Dr Chamber using List Queue --------");
        ListQueue b=new ListQueue();
        try
        {
            Object obj=b.ServePatient();
            System.out.println(obj);
        }
        catch(Exception e)
        {
            System.out.println("No Patient left");
        }
        try{
            System.out.println("can doctor go home ? - "+ b.CanDoctorGoHome());
            b.RegisterPatient(100);
            b.RegisterPatient(200);
            b.RegisterPatient(300);
            b.RegisterPatient(400);
            b.RegisterPatient(500);
            System.out.println("can doctor go home ? - "+ b.CanDoctorGoHome());
            System.out.println("show all patient "+ b.ShowAllPatient());
            b.CancelAll();
            System.out.println("can doctor go home ? - "+ b.CanDoctorGoHome());
        }
        catch(Exception e)
        {

        }

    }
}
