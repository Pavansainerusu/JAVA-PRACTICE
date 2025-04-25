package notify;

class SharedResource {
	 synchronized void produce() {
        System.out.println("Producing...");
        try {
            wait();  // Wait for consume to notify
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Resumed after notify");
    }

	 synchronized void consume() {
        System.out.println("Consuming...");
        notify();  // Wakes up one waiting thread (in this case, produce)
    }
}
