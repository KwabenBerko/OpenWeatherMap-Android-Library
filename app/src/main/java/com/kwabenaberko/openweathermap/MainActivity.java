package com.kwabenaberko.openweathermap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.kwabenaberko.openweathermaplib.implementation.OpenWeatherMapHelper;
import com.kwabenaberko.openweathermaplib.models.CurrentWeather;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate class
        OpenWeatherMapHelper helper = new OpenWeatherMapHelper();

        //Set APP_KEY
        helper.setAppId(getString(R.string.OPEN_WEATHER_MAP_API_KEY));

        //Set Units
        helper.setUnits("imperial");

        /*
        This Example Only Shows how to get current weather by city name
        Check the docs for more methods [https://github.com/KwabenBerko/OpenWeatherMap-Android-Library/]
        */
        helper.getCurrentWeatherByCityName("Accra", new OpenWeatherMapHelper.CurrentWeatherCallback() {
            @Override
            public void onSuccess(CurrentWeather currentWeather) {
                Log.v(TAG,
                        "Coordinates: " + currentWeather.getCoord().getLat() + ", "+currentWeather.getCoord().getLat() +"\n"
                                +"Weather Description: " + currentWeather.getWeatherArray().get(0).getDescription() + "\n"
                                +"Temperature: " + currentWeather.getMain().getTempMax()+"\n"
                                +"Wind Speed: " + currentWeather.getWind().getSpeed() + "\n"
                                +"City, Country: " + currentWeather.getName() + ", " + currentWeather.getSys().getCountry()
                );
            }

            @Override
            public void onFailure(Throwable throwable) {
                Log.v(TAG, throwable.getMessage());
            }
        });
    }
}
