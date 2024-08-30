

/**
 * @author hp
 */
public class ThreadingWithRunnable implements Runnable {

	public static void main(String[] args) {
		Thread threadOne = new Thread(new ThreadingWithRunnable());
		threadOne.setName("ThreadOne");

		threadOne.start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d ", i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();

	}

}
