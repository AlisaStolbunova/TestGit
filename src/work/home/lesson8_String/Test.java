package work.home.lesson8_String;

public class Test {
    public static void main(String[] args) {
        /*TimeTest t = new TimeTest();
        System.out.println("Plus time " + String.valueOf(t.timePlus()).concat("ms"));
        System.out.println("Concatenate time " + String.valueOf(t.timeConcat()).concat("ms"));
        System.out.println("StringBuilder time " + String.valueOf(t.timeBuilder()).concat("ms"));*/

        System.out.println("************");

        String str = ":(rtuyv:(jkhukhkj";
        Replace repl = new Replace();
        str = repl.replace(str);
        System.out.println(str);

        System.out.println("************");
        SubEquals se = new SubEquals();
        System.out.println(se.subEquals("mama rama mama", "mama"));
    }
}
