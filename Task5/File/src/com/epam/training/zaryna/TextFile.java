package com.epam.training.zaryna;

public class TextFile extends File {

    private StringBuilder content = new StringBuilder();

    public TextFile(String name, Directory directory) {
        super(name, directory);
    }

    public void addContent(String content) {
        this.content.append(content);
    }

    public String getContent() {
        return content.toString();
    }
}
