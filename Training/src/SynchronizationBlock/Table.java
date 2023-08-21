package SynchronizationBlock;

public class Table {

	void PrintTable(int n) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}

	}
}
