package work.home.lesson8_String;

public class Words {
    public int amount(String str){
        String[] array = str.split(" ");
        int length = array.length;
        for(String s : array){
            if("".equals(s)){
               length--;
            }
        }
        return length;
    }
}
