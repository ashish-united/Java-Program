class First implements Runnable {
    public void run()
    {         for(int i=0;i<10;i++)     
   {
         System.out.println("thread1 = " + i);
    }
    }
}



public class MyThread implements Runnable
 {
 public void run()
 { 
    for(int i=0; i<5; i++)
    {
        System.out.println("i = " + i);
    }
 System.out.println("Now the thread is running ...");
 }
 // main method
 public static void main(String arg[])
 {
 Runnable r1 = new MyThread();
 Thread th1 = new Thread(r1, "My new thread");
 th1.start();
 Runnable r2 = new First();
 Thread th2 = new Thread(r2, "Mythread");
 th2.start();
 }
 }