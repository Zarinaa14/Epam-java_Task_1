package com.epam.training.zaryna;
//В строке найти количество цифр
public class Main {

    protected static boolean isDigit(char ch){
        return ch>='1'&&ch<='9';
    }

    protected static int calcNumOfDigits(String string){
        int count=0;
        for(int i=0;i<string.length();i++){
            if(isDigit(string.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String line="Word make 55 a word from 6 a word.";

        int numOfDigits=calcNumOfDigits(line);
        System.out.println(line);
        System.out.println("\nЧисло цифр в строке: "+numOfDigits);
    }
}