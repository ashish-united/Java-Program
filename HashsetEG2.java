import java.util.*;
class HashsetEG2{
  public static void main(String[] args) {
      HashSet<String> set = new HashSet<>();
      set.add("Bind");
      set.add("Kumar");
      set.add("Ashish");
      set.add("Tingu");
      Iterator<String> itr = set.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }   
      }
    }