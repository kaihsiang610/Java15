class CTest1 extends Thread {
	private String id;

	public CTest1(String str) {
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

public class Class04 {
	public static void main(String args[])

	{
		CTest1 hi = new CTest1("Hello");
		CTest1 bye = new CTest1("Good bye");
		CTest1 morning = new CTest1("Good morning");
		hi.start();
		bye.start();
		morning.start();
	}
}