class MyCircularQueue{
    int front;
    int cap; 
    int size;
    int arr[];
    MyCircularQueue(int c){
        cap=c;
        front=0;
        arr=new int[cap];
    }
    boolean isEmpty(){
        return (size==0);
    }
    boolean isFull(){
        return (size==cap);
    }
    int getFront(){
        if(isEmpty()){
            return -1;
        }else{
            return front;
        }
    }
    int getRear(){
        if(isEmpty()){
            return -1;
        }else{
            return (front+size-1)%cap;
        }
    }
    void enque(int x){
        if(isFull()){
            System.out.println ("Queue is full");
        }else{
            int rear=getRear();
            rear=(rear+1)%cap;
            arr[rear]=x;
            size++;
        }
    }
    void deque(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            front=(front +1 )%cap;
            size--;
        }
    }
    void print(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    
}
class CircularQueue {
    public static void main(String args[]){
        MyCircularQueue q=new MyCircularQueue(5);
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        
        
        q.deque();
        q.enque(60);
        q.deque();
        System.out.println("front element is:"+q.getFront());
        System.out.println("rear element is:"+q.getRear());
        q.print();
    }
}