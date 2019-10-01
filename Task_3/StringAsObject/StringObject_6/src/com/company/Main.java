package com.company;
//Из заданной строки получить новую, повторив каждый символ дважды

public class Main {

    private static String twiceSymbols(String string){
        StringBuilder builder=new StringBuilder();

        for(int i=0;i<string.length();i++){
            for(int j=0;j<2;j++){
                builder.append(string.charAt(i));
            }
        }

        return builder.toString();
    }

    public static void main(String[] args){
        String line = "Word make  a word from a word.";

        String doubleLine= twiceSymbols(line);
        System.out.println("\nСтрока, в которой каждый символ продублирован дважды: "+doubleLine);
    }
}
