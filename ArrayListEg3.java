import java.util.*;
public class ArrayListEg3 {
    public static void main(String args[]){
        ArrayList<String> ly=new ArrayList<String>();
        ly.add("Bmw");
        ly.add("Bugati");
        ly.add("Audi");
        ly.add("SUV 400");
        ly.add("Breeza");
        for(String Car:ly)
        {
            System.out.println(Car);
        }
    }
    
}
