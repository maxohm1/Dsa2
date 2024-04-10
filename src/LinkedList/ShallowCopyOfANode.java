package LinkedList;

public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(100);
       // Node temp= a;   //shallow copy
        Node temp= new Node(100);   // deep copy (new temp new address);
        System.out.println(a);
        System.out.println(temp);
    }


}
