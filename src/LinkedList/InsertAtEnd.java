package LinkedList;
class SLL{
    Node head;
    Node tail;

    int size;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null) head= tail= temp;
        else{
            tail.next= temp;
            tail= temp;
        }
        size++;

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

public class InsertAtEnd {
        public static void main(String[] args) {
            SLL list = new SLL();
            list.insertAtEnd(1);
            list.insertAtEnd(2);
            list.insertAtEnd(3);
            list.insertAtEnd(4);
            list.insertAtEnd(5);

            list.display();
            list.insertAtEnd(50);
            list.display();

        }
    }


