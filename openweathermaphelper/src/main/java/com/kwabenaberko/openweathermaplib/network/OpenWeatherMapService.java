package com.kwabenaberko.openweathermaplib.network;

import com.kwabenaberko.openweathermaplib.models.currentweather.CurrentWeather;
import com.kwabenaberko.openweathermaplib.models.threehourforecast.ThreeHourForecast;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Kwabena Berko on 7/25/2017.
 */

public interface OpenWeatherMapService {

    //Current Weather Endpoints start
    @GET("/data/2.5/weather")
    Call<CurrentWeather> getCurrentWeatherByCityName(@QueryMap Map<String, String> options);

    @GET("/data/2.5/weather")
    Call<CurrentWeather> getCurrentWeatherByCityID(@QueryMap Map<String, String> options);

    @GET("/data/2.5/weather")
    Call<CurrentWeather> getCurrentWeatherByGeoCoordinates(@QueryMap Map<String, String> optionse);

    @GET("/data/2.5/weather")
    Call<CurrentWeather> getCurrentWeatherByZipCode(@QueryMap Map<String, String> options);

    //Current Weather Endpoints end

    //Three hour forecast endpoints start
    @GET("/data/2.5/forecast")
    Call<ThreeHourForecast> getThreeHourForecastByCityName(@QueryMap Map<String, String> options);

    @GET("/data/2.5/forecast")
    Call<ThreeHourForecast> getThreeHourForecastByCityID(@QueryMap Map<String, String> options);

    @GET("/data/2.5/forecast")
    Call<ThreeHourForecast> getThreeHourForecastByGeoCoordinates(@QueryMap Map<String, String> options);

    @GET("/data/2.5/forecast")
    Call<ThreeHourForecast> getThreeHourForecastByZipCode(@QueryMap Map<String, String> options);
}
