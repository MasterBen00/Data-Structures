public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    //TO DO
    cir=new Object[lin.length];
    start=st;
    size=sz;
    for(int i=0;i<cir.length;i++)
    {
      cir[st]=lin[i];
      st=(st+1)%cir.length;
    }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
        //TO DO
    for(int i=0;i<cir.length-1;i++)
    {
      System.out.print(cir[i]+", ");
    }
     System.out.println(cir[cir.length-1]+".");
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    //To DO
    int st=start;
        for(int i=0;i<size-1;i++)
    {
      System.out.print(cir[st]+", ");
      st=(st+1)%cir.length;
    }
     System.out.println(cir[st]+".");
  }
  
  
  public void printBackward(){
   //TO DO
    int last=(start+size-1)%cir.length;
    for(int i=0;i<size-1;i++)
    {
      System.out.print(cir[last]+", ");
      last--;
      if(last<0)
      {
        last=cir.length-1;
      }    
    }
     System.out.println(cir[last]+".");    
  }
  
  // With no null cells
  public void linearize(){
    //TO DO
    int st=start;
    Object [] arr=new Object[cir.length-1];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=cir[st];
      st=(st+1)%cir.length;
    }
    cir=arr;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    //TO DO
    int st1=start;
    int st2=start;
    Object [] arr=new Object[newcapacity];
    for(int i=0;i<cir.length;i++)
    {
      arr[st1]=cir[st2];
      st2=(st2+1)%cir.length;
      st1=(st1+1)%arr.length;
  }
    cir=arr;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    //TO DO
      int st=start;
    Object [] arr=new Object[newcapacity];
    for(int i=0;i<cir.length;i++)
    {
      arr[i]=cir[st];
      st=(st+1)%cir.length;
  }
    cir=arr;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    //TO DO
    if(size==cir.length)
    {
      resizeStartUnchanged(cir.length+3);
      int rightShift=size-pos;
      int from=(start+size-1)%cir.length;
      int to=(from+1)%cir.length;
      for(int i=0;i<rightShift;i++)
      {
        cir[to]=cir[from];
        to=from;
        from--;
        if(from<0)
        {
          from=cir.length-1;
        }
      }
      int index=(start+pos)%cir.length;
      cir[index]=elem;
      size++;
    }
  }
  
  public void insertByLeftShift(Object elem, int pos){
    //TO DO
     if(size==cir.length)
     {
     resizeStartUnchanged(cir.length+3);
     }
      int leftShift=pos+1;
      int from=start;
      int to=from-1;
      if(to<0)
      {
        to=cir.length-1;
      }
      for(int i=0;i<leftShift;i++)
      {
        cir[to]=cir[from];
        to=(to+1)%cir.length;
        from=(from+1)%cir.length;
      }
      int index=(start+pos)%cir.length;
      cir[index]=elem;
      size++;
      start--;
     
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    //TO DO
    int leftRemove=size-(pos+1);
    int to=(start+pos)%cir.length;
    int from=(to+1)%cir.length;
    for(int i=0;i<leftRemove;i++)
    {
      cir[to]=cir[from];
      to=from;
      from=(from+1)%cir.length;
    }
    int index=(start+size-1)%cir.length;
    cir[index]=null;
    size--;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    //TO DO
        int rightRemove=pos;
    int to=(start+pos)%cir.length;
    int from=to-1;
    if(from<0)
    {
      from=cir.length-1;
    }
    for(int i=0;i<rightRemove;i++)
    {
      cir[to]=cir[from];
      to=from;
      from--;
       if(from<0)
    {
      from=cir.length-1;
    }
    }
    cir[start]=null;
    size--;
    start=(start+1)%cir.length;
  }
  
}