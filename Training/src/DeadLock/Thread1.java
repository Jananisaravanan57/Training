package DeadLock;


public class Thread1 extends Thread {
	X obj1, obj2;

	Thread1(X obj1, X obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {
		synchronized (obj1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
			obj2.display2(obj2);
		}
	}
}