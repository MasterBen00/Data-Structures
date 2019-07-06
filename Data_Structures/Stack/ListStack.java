public class ListStack implements Stack 
{ 
    int size; 
    Node top;      
    public ListStack(){ 
        size = 0; 
        top = null; 
    }  
    public int size()
    {
      int c=0;
      for(Node n=top;n!=null;n=n.next)
      {
        c++;
      }
      return c;
    }
    public boolean isEmpty()
    {
      if(size==0)
      {
        return true;
      }
      return false;
    }
    public void push(Object e)    
    {
     Node n=new Node(e, null);
     n.next=top;
     top=n;
     size++;
    }
    public Object pop() throws StackUnderflowException
    {
      if(size==0)
      {
        throw new StackUnderflowException();
      }
      Node rm=top;
      Object value=top.val;
      top=top.next;
      rm.next=null;
      rm.val=null;
      size--;
      return value;
    }
     public Object peek() throws StackUnderflowException
     {
        if(size==0)
      {
        throw new StackUnderflowException();
      }
        return top.val;
     }
     public String toString()
     {
       String str="";
       for(Node n=top;n!=null;n=n.next)
       {
         str=str+n.val+" ";
       }
       return "[ "+str+"]";
     }
     public Object[] toArray()
     {
       Object [] a=new Object[size];
       int i=0;
        for(Node n=top;n!=null;n=n.next,i++)
       {
         a[i]=n.val;
       }
        return a;
     }
     public int search(Object e)
     {
        int i=0;
        for(Node n=top;n!=null;n=n.next,i++)
       {
         if(n.val.equals(e))
         {
           return i;
         }  
       }
        return -1;
     }
}