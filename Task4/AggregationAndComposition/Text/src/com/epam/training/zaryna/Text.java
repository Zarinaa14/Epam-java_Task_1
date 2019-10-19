package com.epam.training.zaryna;

public class Text {
    private String header;
    private String body = "";

    public Text(Word word) {
        header = word.getWord();
    }

    public Text(Sentence phrase) {
        header = phrase.getValue();
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        body += " " + word.getWord();
    }

    public void addBody(Sentence phrase) {
        body += " " + phrase.getValue();
    }

    public String getBody() {
        return body;
    }
}
