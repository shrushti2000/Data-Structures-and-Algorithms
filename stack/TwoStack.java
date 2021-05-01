public class MyClass{
    
        int cap;
        int top1;
        int top2;
        int arr[];
        public MyClass(int c){
            cap=c;
            top1=-1;
            top2=c;
            arr=new int[cap];
        }
        void add1(int d){
            if(top1>top2){
                System.out.println("Stack 1 overflowed");
            }else{
                top1++;
                arr[top1]=d;
            }
        }
        void add2(int d){
            if(top2<top1){
                System.out.println("Stack 2 is overflowed");
            }else{
                top2--;
                arr[top2]=d;
            }
        }
        void pop1(){
            if(top1==-1){
                System.out.println("Stack 1 is underflowed");
            }else{
                top1--;
            }
        }
        void pop2(){
            if(top2==cap){
                System.out.println("Stack  2 is underflowed");
            }else{
                top2++;
            }
        }
     
        public static void main(String args[]){
            MyClass stack=new MyClass(7);
            stack.add1(10);
            stack.add1(20);
            stack.add1(30);
            stack.add1(40);
            stack.add2(1);
            stack.pop1();
          
            
        }
    
}