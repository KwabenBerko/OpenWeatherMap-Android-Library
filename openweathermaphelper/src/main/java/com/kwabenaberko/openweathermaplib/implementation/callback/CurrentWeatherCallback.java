package com.kwabenaberko.openweathermaplib.implementation.callback;

import com.kwabenaberko.openweathermaplib.model.currentweather.CurrentWeather;

public interface CurrentWeatherCallback{
    void onSuccess(CurrentWeather currentWeather);
    void onFailure(Throwable throwable);
}
