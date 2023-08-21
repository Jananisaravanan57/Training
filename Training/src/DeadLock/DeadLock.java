package DeadLock;


public class DeadLock {
	public static void main(String[] args) {
		X obj1 = new X();
		X obj2 = new X();

		Thread1 t1 = new Thread1(obj1, obj2);
		Thread2 t2 = new Thread2(obj1, obj2);
		t1.start();
		t2.start();
	}
}