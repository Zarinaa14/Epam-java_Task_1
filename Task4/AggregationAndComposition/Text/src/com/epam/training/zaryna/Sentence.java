package com.epam.training.zaryna;

public class Sentence {
    private String value="";

    public void addValue(Word word) {
        value += " " + word.getWord();
    }

    public String getValue() {
        return value;
    }
}
