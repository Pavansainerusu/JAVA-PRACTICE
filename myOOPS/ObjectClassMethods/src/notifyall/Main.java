package notifyall;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Runnable waitingTask = () -> resource.waitForSignal();

        Thread t1 = new Thread(waitingTask, "Thread 1");
        Thread t2 = new Thread(waitingTask, "Thread 2");

        t1.start();
        t2.start();

        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        Runnable r = () -> resource.sendSignalToAll();
        Thread t3 = new Thread(r);
       // Thread t3 = new Thread(resource::sendSignalToAll);
        t3.start();
    }
}
