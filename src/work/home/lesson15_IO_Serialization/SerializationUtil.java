package work.home.lesson15_IO_Serialization;

import java.io.*;

public class SerializationUtil {
    public static void serialization(Object object, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserialization(Object object, String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            object = ois.readObject();
            System.out.printf(object.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
