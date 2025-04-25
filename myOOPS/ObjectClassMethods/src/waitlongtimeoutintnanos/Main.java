package waitlongtimeoutintnanos;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(resource::waitForSignalWithTimeout, "Thread 1");
        t1.start();
        Thread.sleep(500);  
        resource.sendSignal();
    }
}

class SharedResource {
    // Method that waits for a signal with timeout and nanos
    public synchronized void waitForSignalWithTimeout() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting for a signal for 1 second and 500 milliseconds...");
                wait(500, 100000); // 1000 ms = 1 second, and 500,000,000 nanoseconds
            System.out.println(Thread.currentThread().getName() + " has either received the signal or timed out!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to send the signal to wake the waiting thread
    public synchronized void sendSignal() {
        notify();  // Notifies one waiting thread to wake up
    }
}




