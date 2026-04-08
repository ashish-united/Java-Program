// Method Refrence and lambda Expression java program
import java.util.ArrayList;
public class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ashish");
        list.add("Asutosh");
        list.add("Ayan");
        list.add("Anupam");
        // using lambda expression
        list.forEach(x -> System.out.println(x));
        // using method reference
        list.forEach(System.out::println);
    }
} 