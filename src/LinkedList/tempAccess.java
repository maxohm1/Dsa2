package LinkedList;

public class tempAccess {
    public static void main(String[] args) {
        Node a= new Node(100);
        System.out.println(a.val);
        Node temp= a;
        System.out.println(temp);
        temp.val= 12;
        System.out.println(a.val);
    }
}
