package LinkedListPractice;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val= val;
    }
}

class SLL{
    Node head;
    Node tail;
    int size;

    void atlast(int val){
        // if linkedlist is empty
        Node temp = new Node(val);
        if(head==null) head= tail= temp;
        // if node is not empty
        else{
            tail.next= temp;
            tail= temp;
        }
        size++;
    }

    void atstart(int val){
        Node temp= new Node(val);
        // if node is empty
        if(head== null) head= tail= temp;
        else{
            temp.next= head;
            head= temp;
        }
        size++;
    }
    void insert(int index, int val){
        Node temp= new Node(val);
        Node x= head;
        for(int i=0; i<=index-2; i++){
            x= x.next;
        }
        temp.next= x.next;
        x.next= temp;
        size++;
    }
    void deleteAtbeg(){
        Node temp= head;
        if(head==null) System.out.println("Empty node");
        else{
            head= head.next;
        }
        size--;
    }

    void deleteatlast(){
        Node temp= head;
        if(head==null) System.out.println("empty node");
        else if(head.next==null) System.out.println("only one node");
        else{
            for(int i=1; i<=size-2; i++){
                temp=temp.next;
            }
            // or
//            while(temp.next!= tail){
//                temp= temp.next;
//            }
            tail= temp;
            temp.next= null;

            size--;
        }
    }
    void deleteatindex(int index){
        Node temp= head;
        for(int i=0; i<=index-2; i++){
            temp= temp.next;
        }
        temp.next= temp.next.next;
    }
   void getvalue(int pos){
        Node temp= head;
        for(int i=1; i<=pos-1; i++){
            temp= temp.next;
        }
       System.out.println(temp.val+" ");
   }
   void setvalue(int pos, int val){
        Node temp= head;
        if(head==null) System.out.println("List is empty");
        else if(pos<1 || pos>size)
        for(int i=1; i<=pos-1; i++){
            temp= temp.next;
        }
        temp.val = val;
   }
    void display(){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();
    }
}
public class SinglyLinkedList {
    public static void main(String[] args) {
        SLL om= new SLL();
        om.atlast(43);
        om.atlast(32);
        om.atlast(76);
        om.atlast(21);
        om.atlast(87);
        om.atstart(76);

        om.display();
        om.insert(3,43);
        om.display();
        om.deleteAtbeg();
        om.display();
        om.deleteatlast();
        om.display();
        om.deleteatindex(2);
        om.display();
        om.getvalue(3);
        om.setvalue(4,65);
        om.display();

    }
}
