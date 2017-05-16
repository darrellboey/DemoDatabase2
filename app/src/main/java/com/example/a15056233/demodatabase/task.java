package com.example.a15056233.demodatabase;

/**
 * Created by 15056233 on 16/5/2017.
 */

public class task {

    private int id;
    private String description;
    private String date;

    public task(int id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

}
