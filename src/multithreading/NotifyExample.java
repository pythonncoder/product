package multithreading;
class SharedResource {
    private boolean resourceAvailable = false;

    synchronized void useResource(String threadName) {
        while (!resourceAvailable) {
            try {
                System.out.println(threadName + " is waiting for the resource.");
                wait(); // Release the lock and wait for notification
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(threadName + " is using the resource.");
        resourceAvailable = false;
    }

    synchronized void releaseResource() {
        resourceAvailable = true;
        notify(); // Notify one waiting thread
        // notifyAll(); // Notify all waiting threads
    }
}

class MyThread5 extends Thread {
    private SharedResource sharedResource;

    MyThread5(String name, SharedResource sharedResource) {
        super(name);
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.useResource(getName());

        // Simulate some work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        sharedResource.releaseResource();
    }
}

public class NotifyExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create and start multiple threads
        MyThread5 thread1 = new MyThread5("Thread 1", sharedResource);
        MyThread5 thread2 = new MyThread5("Thread 2", sharedResource);

        thread1.start();
        thread2.start();
    }
}
