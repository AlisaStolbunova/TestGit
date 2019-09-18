package work.home.lesson14_IO;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд
 */

public class DigitalSequence {
    static void maxDigitalSequence(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
//        if(matcher.matches()){
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(str.substring(matcher.start(), matcher.end()));
        }
        if (list.size() != 0) {
            int max = list.get(0).length();
            String maxStr = list.get(0);
            if (list.size() == 1) {
                System.out.println(maxStr);
            } else {
                for (int i = 1; i < list.size(); i++) {
                    if (max < list.get(i).length()) {
                        max = list.get(i).length();
                        maxStr = list.get(i);
                    }
                }
                System.out.println(maxStr);
            }
        }
    }
//    }
}
