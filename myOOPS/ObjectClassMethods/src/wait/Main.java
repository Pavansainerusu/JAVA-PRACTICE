package wait;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(resource::waitForSignal, "Thread 1");
        t1.start();
        Thread.sleep(1000);
        resource.sendSignal();
    }
}
class SharedResource {
    public synchronized void waitForSignal() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait();  
            System.out.println(Thread.currentThread().getName() + " has received the signal!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to send the signal to wake the waiting thread
    public synchronized void sendSignal() {
        notify();  // Notifies one waiting thread to wake up
    }
}

