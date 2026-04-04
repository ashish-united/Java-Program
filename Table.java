// Example: Printing multiplication tables using Runnable

class TableTask implements Runnable {
    private int number;

    public TableTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Table of " + number + " by " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(200); // pause for clarity
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
        System.out.println("Finished table of " + number);
    }
}

public class Table {
    public static void main(String[] args) {
        // Create tasks for different tables
        TableTask task2 = new TableTask(2);
        TableTask task5 = new TableTask(5);
        TableTask task7 = new TableTask(7);

        // Wrap tasks in threads
        Thread t1 = new Thread(task2, "Thread-2");
        Thread t2 = new Thread(task5, "Thread-5");
        Thread t3 = new Thread(task7, "Thread-7");

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread continues independently...");
    }
}