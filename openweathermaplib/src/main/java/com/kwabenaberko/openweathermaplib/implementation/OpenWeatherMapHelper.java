package com.kwabenaberko.openweathermaplib.implementation;

import android.support.annotation.NonNull;

import com.kwabenaberko.openweathermaplib.network.OpenWeatherMapClient;
import com.kwabenaberko.openweathermaplib.network.OpenWeatherMapService;
import com.kwabenaberko.openweathermaplib.models.CurrentWeather;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Kwabena Berko on 7/25/2017.
 */

public class OpenWeatherMapHelper {

    private OpenWeatherMapService openWeatherMapService;
    private Map<String, String> options;

    public interface CurrentWeatherCallback{
        void onSuccess(CurrentWeather currentWeather);
        void onFailure(Throwable throwable);
    }

    public OpenWeatherMapHelper(){
        openWeatherMapService = OpenWeatherMapClient.getClient().create(OpenWeatherMapService.class);
        options = new HashMap<>();
        options.put("APPID", "");
        options.put("units", "fahrenheit");
    }

    //METHODS TO SETUP APPLICATION
    public void setApiKey(String appId){
        options.put("APPID", appId);
    }
    public void setUnits(String units){
        options.put("units", units);
    }


    private Throwable NoAppIdErrMessage() {
        return new Throwable("UnAuthorized. Please set your OpenWeatherMap API KEY by using the setApiKey method.");
    }


    private Throwable NotFoundErrMsg(String str) {
        Throwable throwable = null;
        try {
            JSONObject obj = new JSONObject(str);
            throwable = new Throwable(obj.getString("message"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if (throwable == null){
            throwable = new Throwable("An error occured");
        }


        return throwable;
    }


    //GET CURRENT WEATHER BY CITY NAME
    public void getCurrentWeatherByCityName(String city, final CurrentWeatherCallback callback){
        options.put("q", city);
        openWeatherMapService.getCurrentWeatherByCityName(options).enqueue(new Callback<com.kwabenaberko.openweathermaplib.models.CurrentWeather>() {
            @Override
            public void onResponse(@NonNull Call<CurrentWeather> call, @NonNull Response<CurrentWeather> response) {
                HandleCurrentWeatherResponse(response, callback);
            }

            @Override
            public void onFailure(@NonNull Call<CurrentWeather> call, @NonNull Throwable throwable) {
                callback.onFailure(throwable);
            }
        });
    }

    //GET CURRENT WEATHER BY CITY ID
    public void getCurrentWeatherByCityID(String id, final CurrentWeatherCallback callback){
        options.put("id", id);
        openWeatherMapService.getCurrentWeatherByCityID(options).enqueue(new Callback<CurrentWeather>() {
            @Override
            public void onResponse(Call<CurrentWeather> call, Response<CurrentWeather> response) {
                HandleCurrentWeatherResponse(response, callback);
            }

            @Override
            public void onFailure(@NonNull Call<CurrentWeather> call, @NonNull Throwable throwable) {
                callback.onFailure(throwable);
            }
        });

    }

    //GET CURRENT WEATHER BY GEOGRAPHIC COORDINATES
    public void getCurrentWeatherByGeoCoordinates(double latitude, double longitude, final CurrentWeatherCallback callback){
        options.put("lat", String.valueOf(latitude));
        options.put("lon", String.valueOf(longitude));
        openWeatherMapService.getCurrentWeatherByGeoCoordinates(options).enqueue(new Callback<CurrentWeather>() {
            @Override
            public void onResponse(Call<CurrentWeather> call, Response<CurrentWeather> response) {
                HandleCurrentWeatherResponse(response, callback);
            }

            @Override
            public void onFailure(@NonNull Call<CurrentWeather> call, @NonNull Throwable throwable) {
                callback.onFailure(throwable);
            }
        });
    }

    //GET CURRENT WEATHER BY ZIP CODE

    public void getCurrentWeatherByZipCode(String zipCode, final CurrentWeatherCallback callback){
        options.put("zip", zipCode);
        openWeatherMapService.getCurrentWeatherByZipCode(options).enqueue(new Callback<CurrentWeather>() {
            @Override
            public void onResponse(Call<CurrentWeather> call, Response<CurrentWeather> response) {
                HandleCurrentWeatherResponse(response, callback);
            }

            @Override
            public void onFailure(@NonNull Call<CurrentWeather> call, @NonNull Throwable throwable) {
                callback.onFailure(throwable);
            }
        });
    }

    private void HandleCurrentWeatherResponse(Response<CurrentWeather> response, CurrentWeatherCallback callback){
        if (response.code() == HttpURLConnection.HTTP_OK){
            callback.onSuccess(response.body());
        }
        else if (response.code() == HttpURLConnection.HTTP_FORBIDDEN || response.code() == HttpURLConnection.HTTP_UNAUTHORIZED){
            callback.onFailure(NoAppIdErrMessage());
        }
        else{
            try {
                callback.onFailure(NotFoundErrMsg(response.errorBody().string()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
