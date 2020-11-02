class MyStack{
    int cap;
    int top;
    int arr[];

    MyStack(int c){
        top=-1;
        cap=c;
        arr=new int[cap];
    }

    void push(int x){
        if(top==cap-1){
            System.out.println("Overflow");
        }else{

        
        top++;
        arr[top]=x;
        }
    }

    int pop(){
        if(top==-1){
           return 0;
        }else{
            int res=arr[top];
            top--;
            return res;
        }
       
    }

    int peek(){
        return arr[top];
    }

    int size(){
        return top+1;
    }
    boolean isEmpty(){
        return (top==-1);
    }
    void print(){
        int i=top;
        while(i!=-1){
            System.out.println(arr[i]);
            i--;
        }
    }
}
class Stack{
    public static void main(String args[]){
        MyStack s=new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        
       
        
        s.print();
        
        System.out.println(s.peek());
        System.out.println(s);

    }
}