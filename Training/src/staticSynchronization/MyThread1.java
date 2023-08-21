package staticSynchronization;

public class MyThread1 extends Thread{
	
	public void run() {
		Table.printTable(5);
	}

}
