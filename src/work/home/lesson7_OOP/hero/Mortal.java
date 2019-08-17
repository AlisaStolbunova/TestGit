package work.home.lesson7_OOP.hero;

public interface Mortal {
    int getHealth();
    default boolean isAlive(){
        return getHealth() > 0;
    }
}
