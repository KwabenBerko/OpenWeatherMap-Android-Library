package com.kwabenaberko.openweathermaplib.model.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kwabena Berko on 7/25/2017.
 */

public class Clouds {

    @SerializedName("all")
    private double all;

    public double getAll() {
        return all;
    }
}


