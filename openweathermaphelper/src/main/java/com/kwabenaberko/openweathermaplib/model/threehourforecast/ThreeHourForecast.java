package com.kwabenaberko.openweathermaplib.model.threehourforecast;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Kwabena Berko on 8/6/2017.
 */

public class ThreeHourForecast {

    @SerializedName("cod")
    private String cod;

    @SerializedName("message")
    private double message;

    @SerializedName("cnt")
    private int cnt;

    @SerializedName("list")
    private List<ThreeHourForecastWeather> list;

    @SerializedName("city")
    private City city;


    public String getCod() {
        return cod;
    }

    public double getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }

    public List<ThreeHourForecastWeather> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }
}
