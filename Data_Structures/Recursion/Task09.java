import java.util.Scanner;
public class Task09 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Node head = new Node(a, null);
        Node tail = head;
        for (int i = 0; i < 4; i++) {
            int b = sc.nextInt();
            Node n = new Node(b, null);
            tail.next = n;
            tail = tail.next;
        }
        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.val + " ");
        }
        System.out.println();
        reverse(head);

    }

        public static void reverse(Node n) {
            if (n != null) {
                reverse(n.next);
                System.out.print(n.val + " ");
            }
        }

}
