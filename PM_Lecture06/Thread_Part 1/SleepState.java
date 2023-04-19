class SleepThread extends Thread {
	public void run() {
		try {
			sleep(1);
		} catch (InterruptedException e) {
		}
//		sleep always show interruptedExeption, so needs try catch
//		sleep(1);
	}
}

public class SleepState {
	public static void main(String[] args) {
		SleepThread t = new SleepThread();
		System.out.println(t.getState());
		t.start();
		Thread.State s;
		do {
			s = t.getState();
			System.out.println(s);
		} while (s != Thread.State.TERMINATED);
	}

}
