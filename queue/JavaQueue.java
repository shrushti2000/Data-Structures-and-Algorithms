import java.util.ArrayDeque;

public class JavaQueue {
    
    public static void main(String args[]){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q.poll());
        System.out.println(q.peek());
    
    }
}
