package com.example.mycollections.models;

public abstract class LibraryItem {
    private static int nextId = 1;

    protected String name;
    protected int year;
    protected final int id;

    public LibraryItem(String name, int year) {
        this.name = name;
        this.year = year;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
