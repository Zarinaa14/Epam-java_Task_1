package com.company;
// В строке найти количество чисел.
public class Main {
    public static boolean isDigit(char ch){
        return ch>='1'&&ch<='9';
    }

    public static int numOfNumbers(String string){
        int numOfDigits=0;
        boolean prevNumber=false;

        for(int i=0;i<string.length();i++){
            if(isDigit(string.charAt(i))){
                if(prevNumber==false){
                    numOfDigits++;
                }

                prevNumber=true;

            }else{
                prevNumber=false;
            }
        }

        return numOfDigits;
    }

    public static void main(String[] args) {
        String line="Word make 54 a word from 6 a word.";
        int result =numOfNumbers(line);
        System.out.print("Количество чисел в строке: "+result);
    }
}
