

public class SinglyLinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     public Node head=null;
     public Node tail=null;
    void addNode(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new_node;
            tail=new_node;
        }else{
            tail.next=new_node;
            tail=new_node;
        }
    }
    void insertStart(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new_node;
            tail=new_node;
        }else{
            new_node.next=head;
            head=new_node;
        }
    }
    void deleteStart(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            head=head.next;
        }
    }

    void deleteEnd(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node current=head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
            tail=current;
        }

    }
    void deleteMiddle(int n){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node current=head;
            Node previous=head;
            for(int i=0;i<n;i++){
                previous=current;
                current=current.next;
            }
            previous.next=current.next;
        }
    }
    void insertMiddle(int d,int n){
        Node new_node=new Node(d);
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node current=head;
            Node previous=head;
            for(int i=0;i<n;i++){
                previous=current;
                current=current.next;
            }
           new_node.next=current;
           previous.next=new_node;
        }
    }

    void display(){

           Node  current=head;
           while(current!=null){
               System.out.print("  "+current.data);
               current=current.next;
           }
        
    }
    public static void main(String args[]){
        SinglyLinkedList slist=new SinglyLinkedList();
        slist.addNode(10);
        slist.addNode(20);
        slist.addNode(30);
        slist.addNode(40);
        slist.addNode(50);
        slist.insertStart(5);
        slist.insertStart(7);
        
        slist.display();
        System.out.println("");
        slist.deleteStart();
        slist.deleteEnd();
        slist.deleteMiddle(3);
        slist.insertMiddle(25,2);
        slist.display();

    }
}