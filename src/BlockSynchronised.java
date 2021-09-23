class SynchronizedBlock {
    private Integer a = 10;
    private void increment() {
        this.a++;
    }
    private void decrement() {
        this.a--;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlock instanceMethodSynchronized = new SynchronizedBlock();
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                synchronized(lock) {
                    instanceMethodSynchronized.increment();
                }
            }
        }, "IncrementThread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                synchronized (lock) {
                    instanceMethodSynchronized.decrement();
                }
            }
        }, "DecrementThread");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        Thread.sleep(10000);
        System.out.println(instanceMethodSynchronized.a);
    }
}
