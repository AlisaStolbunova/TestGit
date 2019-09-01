package work.home.lesson8_String;


public class Abc {
    public String replaceABC(String str) {
        char[] array = str.toCharArray();
        int count = 0;
        String s = "";
        char ch = array[0];


        for (int i = 1; i < array.length; i++) {
            if (ch == array[i]) {
                count++;
                if (i == array.length - 1) {
                    if (count > 0) {
                        for (int j = 0; j <= count; j++) {
                            s = s.concat(String.valueOf(ch));
                        }
                        str = str.replace(s, String.valueOf(ch));
                    }
                }
            } else {
                if (count > 0) {
                    for (int j = 0; j <= count; j++) {
                        s = s.concat(String.valueOf(ch));
                    }
                    str = str.replace(s, String.valueOf(ch));
                    ch = array[i];
                    count = 0;
                    s = "";
                } else {
                    ch = array[i];
                }
            }
        }

        return str;

    }
}
