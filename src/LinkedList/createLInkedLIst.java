package LinkedList;

class N{
    int val;
    Node next;
    N(int val){
        this.val= val;
    }
}

public class createLInkedLIst {
    public static void main(String[] args) {
        Node a= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        System.out.print(a.val+" ");

        a.next=b;
        b.next= c;
        c.next= d;
        d.next= e;
        System.out.print(a.next.val+" ");
        System.out.print(a.next.next.val+" ");
        System.out.print(a.next.next.next.val+" ");
        System.out.print(a.next.next.next.next.val+" ");

    }
}
