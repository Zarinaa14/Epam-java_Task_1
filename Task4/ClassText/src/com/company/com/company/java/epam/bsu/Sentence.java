package com.company.com.company.java.epam.bsu;

public class Sentence {
    private String value="";

    public void addValue(Word word) {
        value += " " + word.getWord();
    }

    public String getValue() {
        return value;
    }
}
