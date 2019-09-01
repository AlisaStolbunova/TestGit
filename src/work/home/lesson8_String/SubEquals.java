package work.home.lesson8_String;

/*Написать функцию, принимающую 2 параметра: строку и слово и
возвращающую true, если строка начинается и заканчивается этим словом.*/

public class SubEquals {
    public boolean subEquals(String str, String word){
        return (str.startsWith(word.concat(" ")) && (str.endsWith(" ".concat(word))));
    }
}
