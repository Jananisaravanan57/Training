package multiThreading;

class StateExample implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in the RUNNABLE state.");
        
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new StateExample(), "Thread-1");
       // Thread thread2 = new Thread(new StateExample(), "Thread-2");
        
        System.out.println("Thread-1 State: " + thread1.getState());
       // System.out.println("Thread-2 State: " + thread2.getState());
        
        thread1.start();
     //   thread2.start();
        
        Thread.sleep(500); 
        
        System.out.println("Thread-1 State: " + thread1.getState());
       // System.out.println("Thread-2 State: " + thread2.getState());
        
        Thread.sleep(1500); 
        
        System.out.println("Thread-1 State: " + thread1.getState());
       // System.out.println("Thread-2 State: " + thread2.getState());
    }
}

