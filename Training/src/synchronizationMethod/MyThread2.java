package synchronizationMethod;

public class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t = t;
		
	}
	public void run() {
		t.PrintTable(10);
	}

}
