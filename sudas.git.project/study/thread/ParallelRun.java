package thread;

public class ParallelRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Run1 r1 = new Run1();
Run2 r2 = new Run2();

Thread T1 = new Thread(r1);
Thread T2 = new Thread(r2);

T1.start();
T2.start();

	}

}

class Run1 implements Runnable {

	@Override
	public void run() {
		int i;
		for (i = 0; i < 10; i++) {
			System.out.println("Thread 1 " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Run2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for (i = 0; i < 10; i++) {
			System.out.println("Thread 2 " + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}