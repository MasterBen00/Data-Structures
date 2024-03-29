public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO
    Node n=new Node(a[0], null);
    head = n;
    for(int i=1;i<a.length;i++)
    {
      Node temp = new Node(a[i], null);
      n.next=temp;
      n=temp;
    }
      
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    int c=0;
    for(Node n=head;n!=null;n=n.next)
    {
      c++;
    }
    return c; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO    
    for(Node n=head;n!=null;n=n.next)
    {
      System.out.print(n.element+" ");
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    if(idx<0)
    {
      return null;
    }
    int i=0;
    for(Node n=head;n!=null;n=n.next,i++)
    {
      if(i==idx)
      {
        return n;
      }
    }
    return null; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
    if(idx>=0 && idx<countNode())
    {
    Node n=nodeAt(idx);
    return n.element;
    }
    return null; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
    if(idx>=0 && idx<countNode())
    {
      int c=0;
      for(Node n=head;n!=null;n=n.next,c++)
      {
        if(c==idx)
        {
          Object temp=n.element;
          n.element=elem;
          return temp;
        }
      }
    }
    
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
    int i=0;
    for(Node n=head;n!=null;n=n.next,i++)
    {
      if(n.element.equals(elem))
      {
        return i;
      }
    }
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
       int i=0;
    for(Node n=head;n!=null;n=n.next,i++)
    {
      if(n.element.equals(elem))
      {
        return true;
      }
    }
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
    Node copyHead=new Node (head.element,null);
    Node m=copyHead;
    for(Node n=head.next;n!=null;n=n.next)
    {
      Node temp=new Node(n.element,null);
      m.next=temp;
      m=temp;
    }
    return copyHead; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
     Node m=new Node (head.element,null);
    for(Node n=head.next;n!=null;n=n.next)
    {
      Node temp=new Node(n.element,m);
      m=temp;
    }
    return m; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
    if(idx>=0 && idx<=countNode())
    {
    Node mn=new Node(elem,null);
    if(idx==0)
    {
      mn.next=head;
      head=mn;
    }
    else
    {
      Node pred=nodeAt(idx-1);
      mn.next=pred.next;
      pred.next=mn;
    }
    }
    else
    {
      System.out.println("Invalid Index");
    }
    
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
    if(index>=0 && index<countNode())
    {     
      if(index==0)
      {
        Object elem=head.element;
        head=head.next;
        return elem;
      }
      else
      {
        int i=1;
        for(Node n=head;n!=null;n=n.next,i++)
     {
      if(i==index)
      {
        Object elem=n.next.element;
        n.next=n.next.next;
        return elem;
      }
        }
      }
    }
     return null; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
    Node m=head.next;
    for(Node n=head;n!=null;n=n.next)
    {
      if(n.next==null)
      {
        n.next=head;
        head.next=null;
      }
    }
    head=m;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
    for(Node n=head;n!=null;n=n.next)
    {
      if(n.next.next==null)
      {
        n.next.next=head;
        head=n.next;
        n.next=null;        
        break;
      }
  }
  }
}