class CTest2 implements Runnable {
	private String id;

	public CTest2(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 100000000; j++)
				;

			System.out.println(id + " " + i);
		}
	}
}

public class Class07 {
	public static void main(String args[]) {
		CTest2 hi = new CTest2("Hello");
		CTest2 bye = new CTest2("Good bye");
		CTest2 morning = new CTest2("Good morning");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		t1.start();
		t2.start();
		t3.start();
	}
}