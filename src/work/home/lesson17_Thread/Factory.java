package work.home.lesson17_Thread;

public class Factory extends Thread {
    public Dump dump;

    public Factory(Dump map) {
        this.dump = map;
    }

    // static Map<Parts, Integer> parts = new HashMap<>();


    public void run() {
        try {
            int nights = 50;
            int total = 20;
            int count = 0;
            Thread.sleep(100);
            nights--;
            for (int i = 0; i < Parts.values().length; i++) {
                if (i == Parts.values().length - 1) {
                    dump.putParts(Parts.values()[i], total);
                    break;
                }
                count = getRandom(total);
                dump.putParts(Parts.values()[i], count);
                total -= count;
            }
            dump.print();

            while (nights > 0) {
                Thread.sleep(100);
                nights--;
                int random = (int) (1 + Math.random() * 4);
                System.out.println("Factory throws " + random + " detail(s)");

                while (random > 0) {
                    int randomParts = (int) (Math.random() * 9);
                    dump.putParts(Parts.values()[randomParts], 1);
                    random--;
                }

                dump.print();
            }
        } catch (InterruptedException ie) {

        }
    }

    public int getRandom(int total) {
        return (int) (Math.random() * total / 3);
    }
}
