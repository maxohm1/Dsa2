package LinkedList;

public class nodeAccess {
    public static void main(String[] args) {


        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next= b;
        b.next= c;
        c.next= d;
        Node temp = a;
        System.out.println(temp.val);
        temp= temp.next;
        System.out.println(temp.val);

    }
}
