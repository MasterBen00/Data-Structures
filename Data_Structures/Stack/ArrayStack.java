public class ArrayStack implements Stack{ 
    int size; 
    int top; 
    Object [] data; 
     
    public ArrayStack(){ 
        size=0; 
        top =-1; 
        data = new Object[5]; 
    } 
     
     public int size()
     {
       return top+1;
     }
     public boolean isEmpty()
     {
       if(size==0)
       {
         return true;
       }
       return false;
     }
      public void push(Object e) throws StackOverflowException
      {
        if(data.length==top+1)
        {
          throw new StackOverflowException();
        }
        top++;
        data[top]=e;
        size++;
        
      }
         public Object pop() throws StackUnderflowException
         {
           if(top+1==0)
           {
             throw new StackUnderflowException();
                                               }
            Object val=data[top];
            data[top]=null;
            top--;
            size--;
            return val;
         }
  public Object peek() throws StackUnderflowException
  {
    if(data.length==0)
    {
      throw new StackUnderflowException();
    }
    return data[top];
    
  }
   public String toString()
   {
     String str="";
     for(int c=top;c>=0;c--)
     {
       str=str+data[c]+" ";
     }
     return "[ "+str+"]";
     
   }
    public Object[] toArray()
    {
      int k=top;
      Object [] a=new Object[top+1];
      for(int i=0;i<a.length;i++,k--)
      {
        a[i]=data[k];
      }
      return a;
      
    }
    public int search(Object e)
    { 
      int k=0;
      for(int i=top;i>=0;i--,k++)
      {
        if(data[i].equals(e))
        {
          return k;
        }
      }
      return -1;
    }
      
}