public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
        int c=0;
        
        for(Node n=head.next;n!=head;n=n.next)
        {
            c++;
        }
        return c; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO    
        
        for(Node n=head.next;n!=head;n=n.next)
        {
            System.out.print(n.element+" ");
        }
             System.out.println();   
    }
    
    public void backwardprint(){
        // TO DO   
        for(Node n=head.prev;n!=head;n=n.prev)
        {
            System.out.print(n.element+" ");
        }
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
        int c=0;
        if(idx==-1)
        {
            return head;
        }
        for(Node n=head.next;n!=head;n=n.next,c++)
        {
            if(idx==c)
            {
                return n;
            }
        }
        return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
          int c=0;
        for(Node n=head.next;n!=head;n=n.next,c++)
        {
            if(n.element==elem)
            {
                return c;
            }
        }
        
        
        
        return -100; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
        Node pred=nodeAt(idx-1);
        Node mn=new Node(elem,null,null);
       Node succ=pred.next;
       mn.next=succ;
       mn.prev=pred;
       pred.next=mn;
       succ.prev=mn;
       
        
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
        Node rm=nodeAt(index);
        Object val=rm.element;
         Node pred=rm.prev;
         Node succ=rm.next;
         pred.next=succ;
         succ.prev=pred;
        rm.element=null;
        rm.next=null;
        rm.prev=null;
        
        return val; // please remove this line!
    }
    
    
    
}