
class MyDeque {
    int size ,cap;
    int arr[];
    MyDeque(int c){
        cap=c;
        size=0;
        arr=new int[c];
    }
    boolean isEmpty(){
        return (size==0);
    }
    boolean isFull(){
        return (size==cap);
    }
    void insertRear(int x){
        if(isFull()){
            System.out.print("deque is full");
        }else{
            arr[size]=x;
            size++;
        }
    }
    void deleteRear(){
        if(isEmpty()){
            System.out.print("deque is empty");
        }else{
            
            size--;
        }
    }
    void insertFront(int x){
        if(isFull()){
            System.out.println("deque is full");
        }else{
            for(int i=size;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=x;
            size++;
        }
    }
    void deleteFront(){
        if(isEmpty()){
            System.out.println("deque is empty");
        }else{
            for(int i=0;i<size;i++){
                arr[i]=arr[i+1];
            }
            size--;
        }
    }
    void print(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}

public class JavaDeque {
    public static void main(String args[]){
        MyDeque d=new MyDeque(5);
       d.insertRear(10);
        d.insertRear(20);
        
        d.insertRear(30);
         
         d.insertFront(5);
         
        
        d.print();

    }
}


