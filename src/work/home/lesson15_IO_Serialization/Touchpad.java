package work.home.lesson15_IO_Serialization;

import java.io.Serializable;

public class Touchpad implements Serializable {

    private static final long serialVersionUID = 3419161916060067054L;
    private String name;

    public Touchpad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
