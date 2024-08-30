class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code to be executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(500); // Making the thread sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        // Creating instances of MyRunnable
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        // Creating Thread objects and passing MyRunnable instances
        Thread thread1 = new Thread(myRunnable1, "Thread-1");
        Thread thread2 = new Thread(myRunnable2, "Thread-2");

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
