package com.kwabenaberko.openweathermaplib.models.currentweather;

import com.google.gson.annotations.SerializedName;
import com.kwabenaberko.openweathermaplib.models.common.Clouds;
import com.kwabenaberko.openweathermaplib.models.common.Coord;
import com.kwabenaberko.openweathermaplib.models.common.Main;
import com.kwabenaberko.openweathermaplib.models.common.Sys;
import com.kwabenaberko.openweathermaplib.models.common.Weather;
import com.kwabenaberko.openweathermaplib.models.common.Wind;

import java.util.List;

/**
 * Created by Kwabena Berko on 7/25/2017.
 */

public class CurrentWeather {

    @SerializedName("coord")
    private Coord mCoord;

    @SerializedName("weather")
    private List<Weather> mWeatherArray;

    @SerializedName("base")
    private String base;

    @SerializedName("main")
    private Main mMain;

    @SerializedName("wind")
    private Wind mWind;

    @SerializedName("clouds")
    private Clouds mClouds;

    @SerializedName("dt")
    private Long dt;

    @SerializedName("sys")
    private Sys mSys;

    @SerializedName("id")
    private Long id;

    @SerializedName("name")
    private String name;

    public Coord getCoord() {
        return mCoord;
    }

    public void setCoord(Coord coord) {
        mCoord = coord;
    }

    public List<Weather> getWeatherArray() {
        return mWeatherArray;
    }

    public void setWeatherArray(List<Weather> weatherArray) {
        mWeatherArray = weatherArray;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return mMain;
    }

    public void setMain(Main main) {
        mMain = main;
    }

    public Wind getWind() {
        return mWind;
    }

    public void setWind(Wind wind) {
        mWind = wind;
    }

    public Clouds getClouds() {
        return mClouds;
    }

    public void setClouds(Clouds clouds) {
        mClouds = clouds;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return mSys;
    }

    public void setSys(Sys sys) {
        mSys = sys;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
