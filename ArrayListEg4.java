import java.util.*;
public class ArrayListEg4 {
    public static void main(String[] args) {
        ArrayList<String> ay = new ArrayList<>();
        ay.add("Jheel");
        ay.add("Sajal");
        ay.add("Gauri");
        ay.add("Laxmi");
        ay.add("Sara");
        System.out.println(ay);
        System.out.println("You get Element which you insert 1st: "+ay.get(0));
        System.out.println("You get Element which you insert 2nd: "+ay.get(1));
        ay.set(0,"Krishna");
        ay.set(1,"Anuj");
        System.out.println(ay);

    }
    
}
