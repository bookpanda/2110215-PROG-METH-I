class MyThread extends Thread {
	public MyThread(String n) {
		super(n);
	}

//	optional to override method cuz it has super class
	public void run() {
		for (int i = 0; i < 100; ++i)
			System.out.print(getName());
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		new MyThread("A").start();
		new MyThread("B").start();
	}
}
