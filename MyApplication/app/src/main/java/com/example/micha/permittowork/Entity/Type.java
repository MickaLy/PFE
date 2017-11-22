package com.example.micha.permittowork.Entity;

/**
 * Created by micha on 22/11/2017.
 */

public enum Type {

    PDF(".pdf"),
    WORD(".doc"),
    EXCEL(".xls"),
    JPG(".jpg"),
    JPEG(".jpeg"),
    PNG(".png");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
