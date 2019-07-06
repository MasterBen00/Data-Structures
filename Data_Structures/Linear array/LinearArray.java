public class LinearArray{
  public static void main(String [] args){
    int [] a = {10, 20, 30, 40, 50, 60};
    
    System.out.println("\n///// TEST 01: Copy Array example /////");
    int [] b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 02: Print Reverse example /////");
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 03: Reverse Array example /////");
    reverseArray(b);
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
    b = copyArray(a, a.length);
    b=shiftLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
    
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=shiftRight(b,3);
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateRight(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    
    System.out.println("\n///// TEST 08: Insert example 1 /////");
    
    b = copyArray(a, a.length);
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
    System.out.println(bol); // This Should Print: false
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 09: Insert example 2 /////");
    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    
    System.out.println("\n///// TEST 10: Insert example 3 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 11: Remove example 1 /////");
    
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,90);
    System.out.println(bol); // This Should Print: false
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 12: Remove example 2 /////");
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,70);
    System.out.println(bol); // This Should Print: true
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
    
    
    
  }
  
  // Prints the contents of the source array
  public static void printArray(int [] source){
    // TO DO
    System.out.print("{");
    for(int i=0;i<source.length;i++)
    {
      if(i==source.length-1)
      {
     System.out.print(source[i]);
      }
      else { System.out.print(source[i]+" ,");
      }
  }
    System.out.print("}");
    System.out.println();
  }
  
  // Prints the contents of the source array in reverse order
  public static void printReverse(int [] source){
    // TO DO
    int [] a=new int[source.length];
    int k=source.length-1;
    for(int i=0;i<source.length;i++)
    {
      a[k]=source[i];
      k--;
    }
    System.out.print("{");
    for(int i=0;i<a.length;i++)
    {
      if(i==a.length-1)
      {
      System.out.print(a[i]);
      }
      else {
        System.out.print(a[i]+" ,");
      }
      
    }
    System.out.print("}");
    System.out.println();
  }
  
  // creates a copy of the source array and returns the reference of the newly created copy array
  public static int [] copyArray(int [] source, int len){
    // TO DO
    int [] a=new int[len];
    for(int i=0;i<len;i++)
    {
      a[i]=source[i];
    }
    
    return a; // remove this line    
  }
  
  // creates a reversed copy of the source array and returns the reference of the newly created reversed array
  public static void reverseArray(int [] source){
    // TO DO
      int [] a=new int[source.length];
    int k=source.length-1;
    for(int i=0;i<source.length;i++)
    {
      a[k]=source[i];
      k--;
    }
    for(int i=0;i<source.length;i++)
    {
      source[i]=a[i];
      
    }
   
  }
  
  // Shifts all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] shiftLeft(int [] source, int k){
    // TO DO
    int [] a=new int[source.length];
    for(int i=0;i<=source.length-1-k;i++)
    {
      a[i]=source[i+k];
    }
    return a; // remove this line    
  }
  
  // Rotates all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] rotateLeft(int [] source, int k){
    // TO DO
    int [] a=new int[source.length];
    int [] tmp=new int[k];
    for(int i=0;i<tmp.length;i++)
    {
      tmp[i]=source[i];
    }
    for(int i=0;i<=source.length-1-k;i++)
    {
      a[i]=source[i+k];
    }
    int m=source.length-1;
    int n=k-1;
    for(int c=0;c<k;c++)
    {
      a[m]=tmp[n];
      m--;
      n--;
    }
    return a; // remove this line    
  }
  
  // Shifts all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] shiftRight(int [] source, int k){
    // TO DO
    int [] a=new int[source.length];
    for(int i=source.length-1-k;i>=0;i--)
    {
      a[i+k]=source[i];
    }
    return a; // remove this line    
  }
  
  // Rotates all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] rotateRight(int [] source, int k){
    // TO DO
    int [] a=new int[source.length];
    int [] tmp=new int[k];
    int x=source.length-k;
    for(int i=0;i<tmp.length;i++)
    {
      tmp[i]=source[x];
      x++;
    }
    for(int i=source.length-1-k;i>=0;i--)
    {
      a[i+k]=source[i];
    }
    for(int i=0;i<k;i++)
    {
      a[i]=tmp[i];
    }
    
    return a; // remove this line    
  }
  
  /** @return true if insertion is successful; @return false otherwise
    * @param arr the reference to the linear array
    * @param size the number of elements that exists in the array. size<=arr.length
    * @param elem the element that is to be inserted
    * @param index the index in which the element is required to be inserted
    * if insertion is not successful due to lack space, print "No space Left"
    * if given index is invalid, print "Invalid Index"
    * if insertion is successful, print the 'Number of elements after insertion' is completed
    */
  public static boolean insert(int [] arr, int size, int elem, int index){
    // TO DO
    if(size>=arr.length)
    {
      System.out.println("No space Left");
      return false;
    } 
     int temp=arr[index];
     int temp2=0;
     arr[index]=elem;
     for(int i=index+1;i<arr.length;i++)
     {
       temp2=arr[i];
       arr[i]=temp;
       temp=temp2;
     }
    System.out.println("Number of elements after insertion: "+(++size));
     
     return true;   // remove this line    
  }
  
  /** 
   * removes all the occurences of the given element
   * @param arr the reference to the linear array
   * @param size the number of elements that exists in the array. size<=arr.length
   * @param elem the element to be removed
   * @return true if removal is successful; return false otherwise
   * if removal is successful, print the 'Number of elements after removal' is completed
   */  
  public static boolean removeAll(int [] arr, int size, int elem){
    // TO DO
    boolean b=false;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==elem)
      {
        b=true;
        arr[i]=0;
        for(int a=i;a<arr.length-1;a++)
        {
          int temp=arr[a];
          arr[a]=arr[a+1];
          arr[a+1]=temp;
        }
      }
    }
    return b; // remove this line    
  }
}