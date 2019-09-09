package work.home.lesson11_Exception;

public class Pancake {
    boolean isMilk;
    boolean isEgg;
    boolean isFlour;

    public void putMilk() {
        System.out.println("add milk");
        this.isMilk = true;
    }

    public void putEgg() {
        System.out.println("add egg");
        this.isEgg = true;
    }

    public void putFlour() {
        System.out.println("add flour");
        this.isFlour = true;
    }

    public void cookPancake() throws MyException {
        if (isMilk && isEgg && isFlour) {
            System.out.println("Cooking pancake");
        } else {
            throw new MyException("not enough ingredients for pancake");
        }

    }

    public static void test (Pancake pancake){
        pancake.putMilk();
        pancake.putEgg();
        //pancake.putFlour();
        try {
            pancake.cookPancake();
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }
}
