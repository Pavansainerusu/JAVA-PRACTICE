package notify;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.produce());
        Thread t2 = new Thread(() -> resource.consume());
        t1.start();
       try { Thread.sleep(100); } catch (Exception ignored) {}
       t2.start();
    }
}