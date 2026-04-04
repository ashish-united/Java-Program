

class MyRunnable implements java.lang.Runnable {
    @Override
    public void run() {
        // Code executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}

public class Runnable {
    public static void main(String[] args) {
        // Create Runnable object
        MyRunnable task = new MyRunnable();

        // Wrap Runnable in Thread objects
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        // Start threads
        t1.start();
        t2.start();

        // Main thread continues
        System.out.println("Main thread running...");
    }
}