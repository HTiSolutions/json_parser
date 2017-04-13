package com.htisolutions.jsonparser.models;

public class Assessment {

    private enum TYPE {EXAM, COURSEWORK}

    private TYPE type;

    private String name;

    private Integer mark;


    public TYPE getType() {
        return this.type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
