package com.webnovel.downloader.model;

public class Chapter {
    private int index;
    private String name;
    private String content;

    @Override
    public String toString() {
        return "Chapter{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Chapter() {
    }

    public Chapter(int index, String name, String content) {
        this.index = index;
        this.name = name;
        this.content = content;
    }
}
