import java.util.*;
public class Dqueue1 {
    public static void main(String[] args) {
        Deque <String> dq=new ArrayDeque<>();
        dq.offer("arya");
        dq.offer("ashish");
        dq.add("aryan");
        dq.offer("aarti");
        System.out.println("After offerFirst Traversal");
     for(String q:dq){
            System.out.println(q);
        }
        dq.pollLast();
        System.out.println("After PollLast() Traversal");
        for(String Q:dq){
            System.out.println(Q);
        }
          dq.pollFirst();
        System.out.println("After PollFirst() Traversal");
        for(String a:dq){
            System.out.println(a);
        }
    }
    
}
