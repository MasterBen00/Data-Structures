public class ArrayQueue {
    int size;
    int front;
    int rear;
    Object [] data;

    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
    }
    public void RegisterPatient(Object o) throws QueueOverflowException
    {
        if(size==data.length)
        {
            throw new QueueOverflowException();
        }
        else if(size==0)
        {
            front=0;
            rear=0;
            data[rear]=o;
        }
        else
        {
            rear=(rear+1)%data.length;
            data[rear]=o;
        }
        size++;
    }
    public Object ServePatient() throws QueueUnderflowException
    {
        Object val;
        if(size==0)
        {
            throw new QueueUnderflowException();
        }
        else if(front==rear)
        {
            val=data[front];
            data[front]=null;
            front=rear=-1;
        }
        else
        {
            val=data[front];
            data[front]=null;
            front=(front+1)%data.length;
        }
        size--;
        return val;
    }
    public void CancellAll() {
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
        String s="";
        int f=front;
        for(int i=0;i<size;i++)
        {
            s=s+data[f]+" ";
            f=(f+1)%data.length;
        }
        return "[ "+s+"]";
    }
}
