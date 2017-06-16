package com.example.deneme.android201odev2;

import java.io.Serializable;

/**
 * Created by Deneme on 6/16/2017.
 */

public class FormBilgileri implements Serializable {

    String name;
    String surname;
    String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public FormBilgileri(String name,String surname,String date)
    {
        this.name = name;
        this.surname = surname;
        this.date = date;

    }
}
