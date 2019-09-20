package work.home.lesson14_IO;

import java.io.File;
/*
Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
Для этого использовать рекурсию
 */

public class Order {
    static void getOrder(File file) {
        if (file.isDirectory()) {
            System.out.println(file.getPath() + " it is Directory");
            for (File item : file.listFiles()) {
                getOrder(item);
            }
        }else{
            System.out.println(file.getPath() + " it is File");

        }
    }
}
