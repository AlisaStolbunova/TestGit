package work.home.lesson8_String;

public class SubEquals {
    public boolean subEquals(String str, String word){
        return (str.startsWith(word.concat(" ")) && (str.endsWith(" ".concat(word))));
    }
}
