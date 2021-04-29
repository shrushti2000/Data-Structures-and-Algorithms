public class MyClass{
    class Node{
        int data;
        Node next;
        public Node(int d){
            this.data=d;
            this.next=null;
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
            }
        }
        void display(){
            Node curr=head;
            while(curr!=null){
                System.out.print(" "+curr.data);
                curr=curr.next;
                
            }
        }
        void reverse(){
            Node curr=head;
            Node prev=null;
            
            while(curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        public static void main(String args[]){
            MyClass slist=new MyClass();
            slist.add(10);
            slist.add(20);
            slist.add(30);
            slist.add(40);
            slist.add(50);
            slist.display();
            System.out.println("");
            System.out.println("revered linked list is");
           slist.reverse();
           slist.display();
            
        }
    }
