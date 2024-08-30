class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println("Thread class: " + i);
            try {
                Thread.sleep(3000); // 3 seconds interval
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) {
        MyThread mythread1 = new MyThread();
        MyThread mythread2 = new MyThread();
        
        
        
    }
}
