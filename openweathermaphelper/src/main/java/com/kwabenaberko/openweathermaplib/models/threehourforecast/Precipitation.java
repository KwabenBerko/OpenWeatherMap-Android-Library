package com.kwabenaberko.openweathermaplib.models.threehourforecast;

import com.google.gson.annotations.SerializedName;

public class Precipitation {

    @SerializedName("3h")
    private double threeHour;

    public double get3h() {
        return threeHour;
    }

    public void set3h(double threeHour) {
        this.threeHour = threeHour;
    }
}
