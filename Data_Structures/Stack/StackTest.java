public class StackTest
{
  public static void main(String [] args)
  {
    ArrayStack br=new ArrayStack();
    System.out.println("-------- Array Stack --------");
    System.out.println("Trying to pop an empty Stack");
    try
    {
      Object obj=br.pop();
      System.out.println(obj);
    }
    catch(Exception e)
    {
      System.out.println("Error Occured , Empty Stack");
    }
     System.out.println("Trying to peek an empty Stack");
      try
    {
      Object obj=br.peek();
      System.out.println(obj);
    }
    catch(Exception e)
    {
      System.out.println("Error Occured , Empty Stack");
    }
     try
     {
       System.out.println("Stack Empty : " + br.isEmpty());
       System.out.println("Stack size : " + br.size());
       System.out.println("3 elements are pushed");
       br.push(10);
       br.push(20);
       br.push(30);
       System.out.println("Stack Empty : " + br.isEmpty());
       System.out.println("Stack size : " + br.size());
       System.out.println("2 more elements are pushed");
       br.push(40);
       br.push(50);
       System.out.println("Stack Empty : " + br.isEmpty());
       System.out.println("Stack size : " + br.size());
       System.out.println(br.toString());
       Object [] array=br.toArray();
       for(int i=0;i<array.length;i++)
       {
         System.out.print(array[i]+" ");
       }
       System.out.println();
       System.out.println(br.pop() + " " + br.size());
       System.out.println(br.toString());
       System.out.println("peek : "+br.peek());
       br.push(50);
       System.out.println(br.search(10));//4
       System.out.println(br.search(40));//1
       System.out.println(br.search(60));//-1
       br.push(60);// Error
       
     }
     catch(Exception e)
     {
       System.out.println("Error");
     }
     System.out.println("-------- List Stack --------");
     ListStack b=new ListStack();
      System.out.println("Trying to pop an empty Stack");
    try
    {
      Object obj=b.pop();
      System.out.println(obj);
    }
    catch(Exception e)
    {
      System.out.println("Error Occured , Empty Stack");
    }
     System.out.println("Trying to peek an empty Stack");
      try
    {
      Object obj=br.peek();
      System.out.println(obj);
    }
    catch(Exception e)
    {
      System.out.println("Error Occured , Empty Stack");
    }
     try
     {
       System.out.println("Stack Empty : " + b.isEmpty());
       System.out.println("Stack size : " + b.size());
       System.out.println("3 elements are pushed");
       b.push(10);
       b.push(20);
       b.push(30);
       System.out.println("Stack Empty : " + b.isEmpty());
       System.out.println("Stack size : " + b.size());
       System.out.println("2 more elements are pushed");
       b.push(40);
       b.push(50);
       System.out.println("Stack Empty : " + b.isEmpty());
       System.out.println("Stack size : " + b.size());
       System.out.println(br.toString());
       Object [] array=b.toArray();
       for(int i=0;i<array.length;i++)
       {
         System.out.print(array[i]+" ");
       }
       System.out.println();
       b.push(60);
       b.push(70);
       System.out.println(b.toString());
       System.out.println("peek : "+b.peek());
        System.out.println(b.search(10));//6
       System.out.println(b.search(40));//3
       System.out.println(b.search(80));//-1
     }
     catch(Exception e)
     {
       System.out.println("Error");
     }
  }
}