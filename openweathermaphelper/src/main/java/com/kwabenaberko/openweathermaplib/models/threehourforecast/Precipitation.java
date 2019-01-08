package com.kwabenaberko.openweathermaplib.models.threehourforecast;

import com.google.gson.annotations.SerializedName;

public class Precipitation {

    @SerializedName("3h")
    private Double threeHour;

    public Double get3h() {
        return threeHour;
    }

    public void set3h(Double threeHour) {
        this.threeHour = threeHour;
    }
}
