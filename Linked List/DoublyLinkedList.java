public class DoublyLinkedList {
    class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head=null;
    Node tail=null;
    void addNode(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=tail=new_node;
            new_node.prev=null;
            new_node.next=null;
        }else{
            new_node.prev=tail;
            tail.next=new_node;
            tail=new_node;

        }
    }
    void insertStart(int d){
        Node new_node =new Node(d);
        if (head==null){
            System.out.print("List is empty");
        }else{
            new_node.prev=null;
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
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
            new_node.prev=previous;
            new_node.next=current;
            previous.next=new_node;
            current.prev=new_node;
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
            current.next.prev=previous;
        }

    }
    void display(){
        if(head==null){
            System.out.println("List is empty");
        }else{
           Node  current=head;
           while(current!=null){
               System.out.print("  "+current.data);
               current=current.next;
           }
        }
    }
    public static void main(String args[]){
        DoublyLinkedList dlist= new DoublyLinkedList();
        dlist.addNode(10);
        dlist.addNode(20);
        dlist.addNode(30);
        dlist.addNode(40);
        dlist.insertStart(5);
        dlist.insertStart(2);
        
        dlist.insertMiddle(25,3);
        
        dlist.display();
    }
}
