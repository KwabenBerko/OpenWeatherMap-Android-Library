package com.kwabenaberko.openweathermaplib.model.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kwabena Berko on 7/25/2017.
 */

public class Main {
    @SerializedName("temp")
    private double temp;

    @SerializedName("feels_like")
    private double feelsLike;

    @SerializedName("temp_min")
    private double tempMin;

    @SerializedName("temp_max")
    private double tempMax;

    @SerializedName("pressure")
    private double pressure;

    @SerializedName("humidity")
    private double humidity;

    @SerializedName("sea_level")
    private Double seaLevel;

    @SerializedName("grnd_level")
    private Double grndLevel;

    @SerializedName("temp_kf")
    private Double tempKf;


    public double getTemp() {
        return temp;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public double getTempMin() {
        return tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public Double getSeaLevel() {
        return seaLevel;
    }

    public Double getGrndLevel() {
        return grndLevel;
    }

    public Double getTempKf() {
        return tempKf;
    }
}
