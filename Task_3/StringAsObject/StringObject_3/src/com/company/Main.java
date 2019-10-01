package com.company;
// Проверить, является ли заданное слово палиндромом.
public class Main {
    private static Boolean isPalindrome(String string) {
        StringBuilder builder = new StringBuilder(string.toLowerCase());
        return string.toLowerCase().equals(builder.reverse().toString());
    }
    public static void main(String[] args) {
	String string ="LEVEl";
	System.out.println(" "+isPalindrome(string));
    }
}
