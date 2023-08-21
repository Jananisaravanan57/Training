package DeadLock;


public class Thread2 extends Thread {
	X obj1, obj2;

	Thread2(X obj1, X obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {
		synchronized (obj2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
			obj1.display1(obj1);
		}
	}
}
