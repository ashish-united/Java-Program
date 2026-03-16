import java.util.*;
public class Example2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");      
        list.add("Banana");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){    
            System.out.println(it.next());
        }
}
}
// OR //
//for(String fruit:list)
//{
//  System.out.println(fruit);
//}




// System.out.println("Returning the element at index 1: " + list.get(1));// it will return the element at index 1 which is "Apple"
// changing the element at index 1 to "Jamun"
// list.set(1,"Jamun");





// Sorting the list in ascending order
// Collections.sort(list);  
// Traversing the sorted list
// for(String fruit:list)
// {    
//     System.out.println(fruit);
// }


// Traversing element
// Iterator<String> it = list.iterator();
// while(it.hasNext()){    
//     System.out.println(it.next());
// }