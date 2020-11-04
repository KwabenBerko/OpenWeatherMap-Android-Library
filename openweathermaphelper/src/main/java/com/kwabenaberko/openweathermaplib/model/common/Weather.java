package com.kwabenaberko.openweathermaplib.model.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kwabena Berko on 7/25/2017.
 */

public class Weather {

    @SerializedName("id")
    private Long id;

    @SerializedName("main")
    private String main;

    @SerializedName("description")
    private String description;

    @SerializedName("icon")
    private String icon;

    public Long getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }
}
