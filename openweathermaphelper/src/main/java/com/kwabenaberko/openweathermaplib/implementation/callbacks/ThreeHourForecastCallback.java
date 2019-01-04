package com.kwabenaberko.openweathermaplib.implementation.callbacks;

import com.kwabenaberko.openweathermaplib.models.threehourforecast.ThreeHourForecast;

public interface ThreeHourForecastCallback{
    void onSuccess(ThreeHourForecast threeHourForecast);
    void onFailure(Throwable throwable);
}