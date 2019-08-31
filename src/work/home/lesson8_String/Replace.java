package work.home.lesson8_String;

//Заменить все грустные смайлы :( в строке на весёлые :)

public class Replace {

    public String replace(String str){
        str = str.replace(":(", ":)");
        return str;
    }
}
