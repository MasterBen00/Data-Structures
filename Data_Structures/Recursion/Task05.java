public class Task05 {
    public static void main(String [] args){
        int a [] = {1,2,3,4,5};
        Node n=new Node(a[0], null);
        Node head = n;
        for(int i=1;i<a.length;i++)
        {
            Node temp = new Node(a[i], null);
            n.next=temp;
            n=temp;
        }
        indexOf(head,5, 0);
    }
    public static void indexOf(Node n, Object v, int c) {
      if (n.val==v) {
           System.out.println(c);
        }
        else {

            indexOf(n.next, v, c+1);

        }
    }
}
