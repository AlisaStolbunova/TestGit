package work.home.lesson8_String;

/* Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.*/

public class Fio {
    public String returnFIO(String str){
        String[] array = str.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(array[0].charAt(0)).append(".")
                .append(array[1].charAt(0)).append(".")
                .append(array[2].charAt(0)).append(".");

        return sb.toString().toUpperCase();
    }
}
