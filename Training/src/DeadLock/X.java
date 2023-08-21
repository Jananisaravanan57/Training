package DeadLock;


public class X {
	void display1(X obj2) {
		System.out.println("Thread1 waiting for thread2 to release lock");
		synchronized (obj2) {
			System.out.println("Deadlock occurred");
		}
	}

	void display2(X obj1) {
		System.out.println("Thread2 waiting for thread1 to release lock");
		synchronized (obj1) {
			System.out.println("Deadlock occurred");
		}
	}
}