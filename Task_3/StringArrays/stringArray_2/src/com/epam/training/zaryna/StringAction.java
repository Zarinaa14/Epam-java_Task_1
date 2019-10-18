package com.epam.training.zaryna;

public class StringAction {

    public  String[] changeWord(String line, String wordOld, String wordNew) {
        String[] stringArray = line.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            if(wordOld.equals(stringArray[i].toLowerCase())){
                stringArray[i]=wordNew;
            }
        }
        return stringArray;
    }
    public  String[] printStringArray( String[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]+" ");
        }
        return stringArray;
    }
    public  String string(String[] stringArray){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < stringArray.length; i++) {
            builder.append(stringArray[i]);
            builder.append(" ");
        }
        String str = builder.toString();
        return str;
    }
    public  int digits(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
