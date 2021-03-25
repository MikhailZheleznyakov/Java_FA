package com.sem25_03.demo;


import java.time.LocalDate;

public class Blog {
    private Long id;
    private String name;
    private String text;
    private LocalDate creation_date;
    private LocalDate update;
    private String tag;
    private String author;

    public Blog(Long id, String name, String text,
                LocalDate creation_date, LocalDate update,
                String tag, String author) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.creation_date = creation_date;
        this.update = update;
        this.tag = tag;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public LocalDate getUpdate() {
        return update;
    }

    public String getTag() {
        return tag;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreation_date(LocalDate creation_date) {
        this.creation_date = creation_date;
    }

    public void setUpdate(LocalDate update) {
        this.update = update;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
