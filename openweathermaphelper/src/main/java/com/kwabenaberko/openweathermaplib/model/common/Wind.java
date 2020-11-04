package com.kwabenaberko.openweathermaplib.model.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kwabena Berko on 7/25/2017.
 */

public class Wind {
    @SerializedName("speed")
    private double speed;

    @SerializedName("deg")
    private double deg;

    @SerializedName("gust")
    private Double gust;

    public double getSpeed() {
        return speed;
    }

    public double getDeg() {
        return deg;
    }

    public Double getGust() {
        return gust;
    }
}
