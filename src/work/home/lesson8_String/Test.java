package work.home.lesson8_String;

public class Test {
    public static void main(String[] args) {
        TimeTest t = new TimeTest();
        System.out.println("Plus time " + String.valueOf(t.timePlus()).concat("ms"));
        System.out.println("Concatenate time " + String.valueOf(t.timeConcat()).concat("ms"));
        System.out.println("StringBuilder time " + String.valueOf(t.timeBuilder()).concat("ms"));

        System.out.println("************");

        String str = ":(rtuyv:(jkhukhkj";
        Replace repl = new Replace();
        str = repl.replace(str);
        System.out.println(str);

        System.out.println("************");

        SubEquals se = new SubEquals();
        System.out.println(se.subEquals("mama rama mama", "mama"));

        System.out.println("************");

        Fio fio = new Fio();
        System.out.println(fio.returnFIO("stolbunova alisa sergeevna"));

        System.out.println("************");
        Words w = new Words();
        System.out.println(w.amount("mama rama   mama rama  rama mama"));

        System.out.println("************");

        Abc wr = new Abc();
        String s = wr.replaceABC("aaaabccddde");
        System.out.println(s);

        System.out.println("************");
        TenNumbers tt = new TenNumbers();
        System.out.println(tt.concat(111));
        System.out.println(tt.stringBuilder(111));
        System.out.println(tt.numArray(1111));
        System.out.println(tt.format(11));
    }
}
