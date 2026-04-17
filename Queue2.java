import java.util.*;
class Queue2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(23);
        q.add(2443);
        q.add(12344);
        q.add(243);
        System.out.println("head: "+q.element());
        System.out.println("1st elemnet"+q.peek());
        Iterator<Integer> itr=q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        q.remove();
        q.poll();
        System.out.println("After Removing two element");
        Iterator<Integer> it=q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); 
        }
    }
    
}