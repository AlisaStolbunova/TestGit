package work.home.lesson17_Thread;

public class MyThread extends Thread {
    static long sum = 0;

    public void run() {
        System.out.println("Thread " + this.getName() + " State:" + this.getState());
        for (int i = 1; i <= 10000; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sum += i;
            }
            if (i % 1000 == 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        System.out.println("Sum = " + sum);
    }

}
