package com.example.recyclerviewchallenge;

import androidx.annotation.DrawableRes;

public class Cards {

    String title;
    String description;
    int image;

    public Cards(String title, String description, @DrawableRes int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }
}
