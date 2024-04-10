package LinkedList;

class LL{
    Node head;
    Node tail;
    int size;

    void atend(int val){
        Node temp= new Node(val);
        if(head==null) head= tail= temp;
        else{
            tail.next= temp;
            tail= temp;
        }
        size++;
    }
    void size(){
        System.out.println("size : "+size);

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
public class atlast {
    public static void main(String[] args) {
        LL list = new LL();
        list.atend(1);
        list.atend(2);
        list.atend(3);
        list.display();
       list.size();
       list.atend(43);
       list.display();
       list.size();
    }
}
