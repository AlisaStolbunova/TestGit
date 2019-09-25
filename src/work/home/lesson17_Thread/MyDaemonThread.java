package work.home.lesson17_Thread;

public class MyDaemonThread extends Thread {
    public MyDaemonThread() {
        setDaemon(true);
    }

    public void run(){
        while (true){
            System.out.println("DemonThread " + Thread.currentThread().getName() + " State " + Thread.currentThread().getState());
            try{
                Thread.sleep(5);
            }catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(MyThread.sum);
        }
    }
}
