package com.kwabenaberko.openweathermaplib.implementation.callbacks;

import com.kwabenaberko.openweathermaplib.models.currentweather.CurrentWeather;

public interface CurrentWeatherCallback{
    void onSuccess(CurrentWeather currentWeather);
    void onFailure(Throwable throwable);
}
