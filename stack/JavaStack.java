import java.util.*;
class JavaStack{
    public static void main(String args[]){
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}