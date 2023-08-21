package SynchronizationBlock;



public class SyncBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();
		
		MyThread1 thread1 = new MyThread1(obj);
		MyThread2 thread2 = new MyThread2(obj);
		
		thread1.start();
		thread2.start();
	}
}
