public class MyClass{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public Node head=null;
    public Node tail=null;
    void add(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new_node;
            tail=new_node;
        }else{
            tail.next=new_node;
            tail=new_node;
            tail.next=head;
        }
    }
    void insertFirst(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
             Node current=head;
            while(current.next!=head){
                current=current.next;
            }
            new_node.next=head;
            head=new_node;
            current.next=head;
           
        }
    }
      void deleteFirst(){
       if(head==null){
           System.out.print("List is empty");
       }else{
           Node current=head;
           while(current.next!=head){
               current=current.next;
           }
           head=head.next;
           current.next=head;
       }
    }
    void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            
        }else{
             Node current=head;
             Node prev=head;
            while(current.next!=head){
                prev=current;
                current=current.next;
            }
            prev.next=current.next;
           
            
        }
    }
    void display(){
        Node current=head;
        while(current.next!=head){
             System.out.print(" "+current.data);
            current=current.next;
           
        }
         System.out.print(" "+current.data);
    }
    public static void main(String args[]){
        MyClass cList=new MyClass();
        cList.add(10);
        cList.add(20);
        cList.add(30);
         cList.add(40);
          cList.add(50);
          cList.insertFirst(5);
          cList.insertFirst(2);
           cList.add(55);
        cList.display();
        System.out.println("____________");
          cList.deleteFirst();
           cList.display();
            System.out.println("____________");
          cList.deleteFirst();
           cList.display();
           System.out.println("____________");
          cList.deleteLast();
           cList.display();
        
    }
}