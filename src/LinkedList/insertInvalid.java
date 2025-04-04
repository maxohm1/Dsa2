
class Invalid{
    Node head;
    Node tail;
    int size;

    void beg(int val){
        Node temp= new Node(val);
        if(head==null) head= tail=temp;
        else{
            temp.next= head;
            head= temp;
        }
        size++;
    }
    void last(int val){
        Node temp= new Node(val);
        if(head==null) head= tail= temp;
        else{
            tail.next= temp;
            tail= temp;
        }
    }

    void display(){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
    }

    void insert(int indx, int val){

        if(indx==0){
            beg(val);
            return;
        }
        if(indx== size){
            last(val);
            return;
        }
        if(indx>size ||indx<0){
            System.out.println("invalid index");
            return;
        }
        Node temp = new Node(val);
        Node x=head ;
        for(int i=1; i<= indx-1; i++){
            x= x.next;
        }
        temp.next= x.next;
        x.next= temp;
        size++;

    }
}

public class insertInvalid {
    public static void main(String[] args) {
        Invalid list = new Invalid();
        list.beg(43);
        list.beg(34);
        list.beg(12);
        list.beg(86);
        list.last(76);
        list.insert(98,456);
        list.display();


    }
}
