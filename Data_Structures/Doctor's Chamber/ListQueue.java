public class ListQueue {
    int size;
    Node front;
    Node rear;


    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    public int size(){
        return size;
    }
    public void RegisterPatient(Object o)
    {
        Node mn=new Node(o, null);
        if(size==0)
        {
            front=mn;
            rear=mn;
        }
        else
        {
            rear.next=mn;
            rear=mn;
        }
        size++;
    }
    public Object ServePatient() throws QueueUnderflowException
    {
        Node rm;
        Object obj;
        if(front==null)
        {
            throw new QueueUnderflowException();
        }
        else if(size==1)
        {
            obj=front.val;
            rm=front;
            front=rear=null;
        }
        else
        {
            obj=front.val;
            rm=front;
            front=front.next;
        }
        rm.val=null;
        rm.next=null;
        rm=null;
        size--;
        return obj;
    }
    public void CancelAll()
    {
        boolean b = CanDoctorGoHome();
        int s=size;
        try {
            if (b == false) {
                for (int i = 0; i <s; i++) {
                    ServePatient();
                }
            }
        } catch (Exception e) {
        }
    }
    public boolean CanDoctorGoHome()
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }
    public String ShowAllPatient()
    {
        String str="";
        for(Node n=front;n!=null;n=n.next)
        {
            str=str+n.val+" ";
        }
        return "[ "+str+"]";
    }
}
