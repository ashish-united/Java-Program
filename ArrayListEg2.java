import java.util.*;
public class ArrayListEg2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ashish");
        list.add("Asutosh");
        list.add("Ayan");
        list.add("Anupam");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
