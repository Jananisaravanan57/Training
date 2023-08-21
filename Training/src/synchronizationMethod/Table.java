package synchronizationMethod;


class Table {
	
	synchronized void PrintTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
