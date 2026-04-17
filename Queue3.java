import java.util.*;
public class Queue3{
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<>();
        dq.add("Arya");
        dq.add("Ashish");
        dq.add("Aryan");
        dq.add("Aru");
        for(String str:dq){
            System.out.println(str);
        }
    }
}