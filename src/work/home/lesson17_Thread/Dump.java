package work.home.lesson17_Thread;


public class Dump {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.start();

        Laborer laborer = new Laborer();
        laborer.start();


        try {
            Thread.sleep(6000);
            System.out.println(laborer.robots + " robots done");
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }


    }
}
