package work.home.lesson17_Thread;

public class ScientistDemo {
    public static void main(String[] args) {
        Dump partsInDump = new Dump();
        Factory factory = new Factory(partsInDump);
        factory.start();

        Laborer laborer1 = new Laborer(partsInDump);
        laborer1.start();
        Laborer laborer2 = new Laborer(partsInDump);
        laborer2.start();


        try {
            Thread.sleep(6000);
            System.out.println("Laborer1 " + laborer1.robots + " robots done; "
                    + "Laborer2 " + laborer2.robots + " robots done");
            if (laborer1.robots > laborer2.robots) {
                System.out.println("Scientist 1 won");
            } else if (laborer1.robots < laborer2.robots) {
                System.out.println("Scientist 2 won");
            } else {
                System.out.println("Draw");
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
