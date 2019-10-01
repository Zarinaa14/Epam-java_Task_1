package com.company;
//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef"

public class Main {

    //Удаляет все повторяющиеся символы и пробелы
    public static String removeSymbolDuplicate(String string){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            String si = string.substring(i, i + 1);
            if (!si.equals(" ") && builder.indexOf(si) == -1 ) {
                builder.append(si);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args){
        String line = "abc  cde def";

        String noDuplicates= removeSymbolDuplicate(line);
        System.out.println("\nСтрока, в которой удалены повторяющиеся символы: "+noDuplicates);
    }
}