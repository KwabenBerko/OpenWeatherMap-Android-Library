package com.kwabenaberko.openweathermaplib.model.common;

import com.google.gson.annotations.SerializedName;

public class Precipitation {

    @SerializedName("1h")
    private Double oneHour;

    @SerializedName("3h")
    private Double threeHour;

    public Double getOneHour() {
        return oneHour;
    }

    public Double getThreeHour() {
        return threeHour;
    }
}
