class CTest4 implements Runnable {
	private String id;

	public CTest4(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep((int) (2000 * Math.random()));
			} catch (InterruptedException e) {
			}
			System.out.println(id + " " + i);
		}
	}
}

public class Class10 {
	public static void main(String args[]) {
		CTest4 hi = new CTest4("Hello");
		CTest4 bye = new CTest4("Good bye");
		CTest4 morning = new CTest4("Good morning");
		CTest4 night = new CTest4("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}