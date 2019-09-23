package work.home.lesson15_IO_Serialization;


public class Demo {
    public static void main(String[] args) {
        // TestRW.test();
        Computer comp = new Computer("Acer", "Intel Core i9", 3000, "NVIDIA");
        SerializationUtil.serialization(comp, "/Users/alisa/Desktop/Courses/Serialization.txt");
        SerializationUtil.deserialization(new Computer(null, null, 0, null),
                "/Users/alisa/Desktop/Courses/Serialization.txt");

        Notebook notebook = new Notebook("HP", "Intel Core i5", 1000, "NVIDIA",
                new Touchpad("Synaptics"), 15.6);
        SerializationUtil.serialization(notebook, "/Users/alisa/Desktop/Courses/NoteSerialization.txt");
        SerializationUtil.deserialization(new Notebook(null, null, 0, null, new Touchpad((null)), 0), "/Users/alisa/Desktop/Courses/NoteSerialization.txt");


    }
}
