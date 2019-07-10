package com.example.hw7919;

import java.io.Serializable;

public class Person implements Serializable {

    private String name, imageurl, phone;


    public Person() {
    }

    public Person(String name, String phone, String imageurl) {
        // always set your constructor!!!!
        this.name = name;
        this.phone = phone;
        this.imageurl = imageurl;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

}
