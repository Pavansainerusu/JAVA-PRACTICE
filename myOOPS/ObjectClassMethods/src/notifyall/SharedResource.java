package notifyall;
class SharedResource 
{
    synchronized void waitForSignal() 
    {
        System.out.println(Thread.currentThread().getName() + " is waiting...");
        try 
        {
            wait(); // thread waits
         } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is resumed");
    }

    synchronized void sendSignalToAll() {
        System.out.println("Sending signal to all waiting threads...");
        notifyAll(); // notifies all waiting threads
    }
}

