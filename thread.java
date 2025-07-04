class MyThread extends Thread {
    public void run() {
        // This code runs in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class thread{
    public static void main(String[] args) {
        MyThread t = new MyThread();  // Create thread object
        t.start();                    // Start the thread

        // Main thread execution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

