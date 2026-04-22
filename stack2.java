import java.util.*;
public class stack2
{
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
        vs.pop();
        vs.pop();
        vs.pop();
        vs.push("Apple");
        vs.push("Realme");
        vs.push("Redmi");
        System.out.println("After Adding:"+vs);
    }
}