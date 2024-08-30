
/**
 * @author hp
 */
public class ThreadingWithThread extends Thread {

	public static void main(String[] args) {
		Thread threadOne = new Thread(new ThreadingWithThread(), "Thread-One");
		threadOne.start();

		if (threadOne.isAlive()) {
			System.out.println(threadOne.getName() + " is alive");
		}

		try {
			threadOne.join();
		} catch (InterruptedException e) {
			e.getMessage();
		}

		if (!threadOne.isAlive()) {
			System.out.println(threadOne.getName() + " is Dead");
		}

	}

	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			System.out.println(i);

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}

}
