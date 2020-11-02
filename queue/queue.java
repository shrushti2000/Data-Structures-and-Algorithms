class MyQueue{
    int size,arr[],cap;
    MyQueue(int c){
        size=0;
        cap=c;
        arr=new int[c];
    }
    boolean isEmpty(){
        return (size==0);
    }
    boolean isFull(){
        return (size==cap);
    }
    void enque(int x){
        if(isFull()){
            System.out.println("Queue is fulll");
        }else{
            arr[size]=x;
            size++;
        }
    }
void deque(){
    if(isEmpty()){
        System.out.println("Queue is empty");
    }
    for(int i=0;i<size-1;i++){
        arr[i]=arr[i+1];
        
    }
    size--;
   
}

int getFront(){
    if(isEmpty()){
        return -1;
    }else{
        return arr[0];
    }
}

int getRear(){
    if(isEmpty()){
        return -1;
    }else{
        return arr[size-1];
    }
}

void print(){
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
}
}
class Queue
{
    public static void main(String args[]){
        MyQueue q=new MyQueue(5);
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        
        q.deque();
        System.out.println("front element is:"+q.getFront());
        System.out.println("rear element is:"+q.getRear());
        q.print();
    }
}