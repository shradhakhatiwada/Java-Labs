

/**
 * @author hp
 */

class Counter {
	private int count = 0;

	public synchronized void counterIncrement() {
		count += 2;
		System.out.println("Count Increased to: " + count);
	}

	public void counterDecrement() {
		synchronized (this) {
			count--;
			System.out.println("Count Decreased to: " + count);
		}
	}
}

class CounterIncrementorRunnable implements Runnable {
	private Counter counter;

	public CounterIncrementorRunnable(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			counter.counterIncrement();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getLocalizedMessage();
			}
		}
	}
}

class CounterDecrementorRunnable implements Runnable {

	private Counter counter;

	public CounterDecrementorRunnable(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			counter.counterDecrement();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getLocalizedMessage();
			}
		}

	}

}

public class ThreadSyncronization {

	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread incrementalThread = new Thread(new CounterIncrementorRunnable(counter), "Incremental Thread");
		Thread decrementalThread = new Thread(new CounterDecrementorRunnable(counter), "Decremental Thread");

		incrementalThread.start();
		decrementalThread.start();

	}

}
