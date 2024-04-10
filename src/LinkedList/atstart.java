package LinkedList;

class start{
    Node head;
    Node tail;
    int size;

    void atbeg(int val){
        Node temp = new Node(val);
        if(head==null) head= tail= temp;
        else{
            temp.next= head;
            head= temp;
        }
        size++;
    }

    void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    void size(){
        System.out.println("size : "+size);
    }

}

public class atstart {
    public static void main(String[] args) {
        start list = new start();
        list.atbeg(32);
        list.atbeg(23);
        list.atbeg(12);
        list.atbeg(76);
        list.atbeg(43);
        list.display();
        list.size();
    }
}
