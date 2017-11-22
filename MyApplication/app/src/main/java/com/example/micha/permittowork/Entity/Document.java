package com.example.micha.permittowork.Entity;

/**
 * Created by micha on 22/11/2017.
 */

public class Document {

    private static int ID = 0;
    private String name;
    private int size;
    
    public Document(String name, int size) {
        ID++;
        this.name = name;
        this.size = size;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
