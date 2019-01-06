package com.kwabenaberko.openweathermaplib.models.threehourforecast;

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
    private List<ThreeHourWeather> mList;

    @SerializedName("city")
    private City mCity;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<ThreeHourWeather> getList() {
        return mList;
    }

    public void setList(List<ThreeHourWeather> list) {
        mList = list;
    }

    public City getCity() {
        return mCity;
    }

    public void setCity(City city) {
        mCity = city;
    }
}
