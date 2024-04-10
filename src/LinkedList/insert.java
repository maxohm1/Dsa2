package LinkedList;

class inst{
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

    void atlast(int val) {
        Node temp= new Node(val);
            if(head==null) head= tail= temp;
            else{
                tail.next= temp;
                tail= temp;
            }

    }
    void insert(int idx, int val){

        Node temp= new Node(val);
        Node x= head;
        for(int i=1; i<=idx-1; i++){
            x= x.next;
        }

        temp.next= x.next;
        x.next= temp;
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

public class insert {
    public static void main(String[] args) {
        inst list = new inst();
        list.atlast(32);
        list.atlast(23);
        list.atlast(12);
        list.atlast(9);
        list.atlast(25);
        list.atbeg(98);
        list.insert(2,67);
        list.display();
        list.insert(2, 100);
        list.display();
    }
}
