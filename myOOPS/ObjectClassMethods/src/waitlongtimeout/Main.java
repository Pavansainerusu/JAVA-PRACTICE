package waitlongtimeout;
public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {
        SharedResource resource = new SharedResource();

        // Thread 1 will wait for a signal (with timeout)
        Thread t1 = new Thread(resource::waitForSignalWithTimeout, "Thread 1");
        t1.start();

        // Wait for a short time before sending the signal
        Thread.sleep(1000);  // Simulate some other work being done

        // Thread 2 sends the signal
        resource.sendSignal();
    }
}

class SharedResource {
    // Method that waits for a signal with a timeout
    public synchronized void waitForSignalWithTimeout() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting for a signal for 3 seconds...");
            wait(3000);  // Wait for 3 seconds (3000 milliseconds)
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


