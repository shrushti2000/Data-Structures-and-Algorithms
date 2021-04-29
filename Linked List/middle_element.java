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
        void middle(){
            Node ptr1=head;
            Node ptr2=head;
            while(ptr2!=null && ptr2.next!=null){
                ptr1=ptr1.next;
                ptr2=ptr2.next.next;
            }
            System.out.println("Midddle element is :" +ptr1.data);
        }
       
        public static void main(String args[]){
            MyClass slist=new MyClass();
            slist.add(10);
            slist.add(20);
            slist.add(30);
            slist.add(40);
            slist.add(50);
            slist.add(60);
            slist.add(70);
            slist.add(80);
            slist.display();
            slist.middle();
           
            
        }
    }
