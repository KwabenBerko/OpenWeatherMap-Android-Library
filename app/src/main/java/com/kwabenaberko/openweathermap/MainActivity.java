package com.kwabenaberko.openweathermap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.kwabenaberko.openweathermaplib.implementation.OpenWeatherMapHelper;
import com.kwabenaberko.openweathermaplib.models.CurrentWeather;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OpenWeatherMapHelper helper = new OpenWeatherMapHelper();
        helper.setAppId("e1e88645e0c18f577551c16afbe063fd");
        helper.getCurrentWeatherByZipCode("97205", new OpenWeatherMapHelper.CurrentWeatherCallback() {
            @Override
            public void onSuccess(CurrentWeather currentWeather) {
                Toast.makeText(MainActivity.this, currentWeather.getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Throwable throwable) {
                Log.v("RES", throwable.getMessage());
            }
        });
    }
}
