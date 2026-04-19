import java.util.*;
public class Stack1 {
    public static void main(String[] args) {
        Stack<String> vs= new Stack<>();
        vs.push("Mac Book");
        vs.push("Hp");
        vs.push("Dell");
        vs.push("Acer");
        System.out.println("After the Push"+vs);
        vs.pop();
        vs.pop(); 
        System.out.println("After the Pop: "+vs);
        vs.add("Lenovo");
        System.out.println("After Adding: "+vs);
    }
}
