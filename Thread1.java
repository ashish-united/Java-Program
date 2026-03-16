// A Java program to demonstrate the working of multiple threads by extending the Thread class
// Sleep method is used to pause the execution of a thread for a specified time period.


class First extends Thread {
    public void run()
    {         for(int i=0;i<10;i++)     
   {
         System.out.println("thread1 = " + i);
     try {
             Thread.sleep(500);
     } catch (Exception e) {
        System.out.println("Error in thread1: " + e.getMessage());
     }
    }
    }
}
class Second extends Thread
{
     public void run() {
        for(int i=11;i<20;i++)
        {
            System.out.println("thread2 = " + i);
            try {
             Thread.sleep(500);
     } catch (Exception e) {
        System.out.println("Error in thread2: " + e.getMessage());
     }
        }
     }
}
public class Thread1
{
 public static void main(String[] args) 
    {
        First f = new First();
        Second s = new Second();
        f.start();
        s.start();
     
 }

}
   