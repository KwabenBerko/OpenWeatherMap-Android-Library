
## OpenWeatherMap-Android-Library  
[![](https://jitpack.io/v/KwabenBerko/OpenWeatherMap-Android-Library.svg)](https://jitpack.io/#KwabenBerko/OpenWeatherMap-Android-Library)


**You need an API Key to use the OpenWeatherMap API. Head on over to their [website](http://openweathermap.org/) if you don't already have one.**


## Download

#### Step 1. Add the JitPack repository to your root ```build.gradle``` file.

``` java
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

#### Step 2 : Download via ```Gradle```:

```java
implementation 'com.github.KwabenBerko:OpenWeatherMap-Android-Library:2.1.0'
```

**Note: Remember to include the INTERNET permission to your manifest file**

## Usage

#### Instantiate Class With Your OpenWeatherMap Api Key

``` java 
OpenWeatherMapHelper helper = new OpenWeatherMapHelper(getString(R.string.OPEN_WEATHER_MAP_API_KEY));
```

#### Set your Units (Optional, STANDARD by default)

``` java 
helper.setUnits(Units.IMPERIAL);
```

##### Unit Options: 

1. ```Units.IMPERIAL (Fahrenheit)```

2. ```Units.METRIC (Celsius)```

#### Set your Language (ENGLISH by default)

``` java
helper.setLanguage(Languages.ENGLISH);
```

## Features


### (1) Current Weather
#### Get current weather by City Name:

```java
 helper.getCurrentWeatherByCityName("Accra", new CurrentWeatherCallback() {
     @Override
     public void onSuccess(CurrentWeather currentWeather) {
         Log.v(TAG, "Coordinates: " + currentWeather.getCoord().getLat() + ", "+currentWeather.getCoord().getLon() +"\n"
                         +"Weather Description: " + currentWeather.getWeather().get(0).getDescription() + "\n"
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
```

#### Get current weather by City ID:
```java
 helper.getCurrentWeatherByCityID("524901", new CurrentWeatherCallback() {
     @Override
     public void onSuccess(CurrentWeather currentWeather) {
         Log.v(TAG, "Coordinates: " + currentWeather.getCoord().getLat() + ", "+currentWeather.getCoord().getLon() +"\n"
                         +"Weather Description: " + currentWeather.getWeather().get(0).getDescription() + "\n"
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
```
#### Get current weather by Geographic Coordinates:

```java
 helper.getCurrentWeatherByGeoCoordinates(5.6037, 0.1870, new CurrentWeatherCallback() {
     @Override
     public void onSuccess(CurrentWeather currentWeather) {
         Log.v(TAG, "Coordinates: " + currentWeather.getCoord().getLat() + ", "+currentWeather.getCoord().getLon() +"\n"
                         +"Weather Description: " + currentWeather.getWeather().get(0).getDescription() + "\n"
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
```
#### Get current weather by Zip Code:
```java
 helper.getCurrentWeatherByZipCode("90003", new CurrentWeatherCallback() {
     @Override
     public void onSuccess(CurrentWeather currentWeather) {
         Log.v(TAG, "Coordinates: " + currentWeather.getCoord().getLat() + ", "+currentWeather.getCoord().getLon() +"\n"
                         +"Weather Description: " + currentWeather.getWeather().get(0).getDescription() + "\n"
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
```
### (2) 5 day / 3 hour forecast
#### Get three hour forecast by City Name:
```java
 helper.getThreeHourForecastByCityName("Pretoria", new ThreeHourForecastCallback() {
     @Override
     public void onSuccess(ThreeHourForecast threeHourForecast) {
         Log.v(TAG, "City/Country: "+ threeHourForecast.getCity().getName() + "/" + threeHourForecast.getCity().getCountry() +"\n"
                         +"Forecast Array Count: " + threeHourForecast.getCnt() +"\n"
                         //For this example, we are logging details of only the first forecast object in the forecasts array
                         +"First Forecast Date Timestamp: " + threeHourForecast.getList().get(0).getDt() +"\n"
                         +"First Forecast Weather Description: " + threeHourForecast.getList().get(0).getWeather().get(0).getDescription()+ "\n"
                         +"First Forecast Max Temperature: " + threeHourForecast.getList().get(0).getMain().getTempMax()+"\n"
                         +"First Forecast Wind Speed: " + threeHourForecast.getList().get(0).getWind().getSpeed() + "\n"
         );
     }

     @Override
     public void onFailure(Throwable throwable) {
         Log.v(TAG, throwable.getMessage());
     }
 });
```
#### Get three hour forecast by City ID:
```java
 helper.getThreeHourForecastByCityID("524901", new ThreeHourForecastCallback() {
     @Override
     public void onSuccess(ThreeHourForecast threeHourForecast) {
         Log.v(TAG, "City/Country: "+ threeHourForecast.getCity().getName() + "/" + threeHourForecast.getCity().getCountry() +"\n"
                         +"Forecast Array Count: " + threeHourForecast.getCnt() +"\n"
                         //For this example, we are logging details of only the first forecast object in the forecasts array
                         +"First Forecast Date Timestamp: " + threeHourForecast.getList().get(0).getDt() +"\n"
                         +"First Forecast Weather Description: " + threeHourForecast.getList().get(0).getWeather().get(0).getDescription()+ "\n"
                         +"First Forecast Max Temperature: " + threeHourForecast.getList().get(0).getMain().getTempMax()+"\n"
                         +"First Forecast Wind Speed: " + threeHourForecast.getList().get(0).getWind().getSpeed() + "\n"
         );
     }

     @Override
     public void onFailure(Throwable throwable) {
         Log.v(TAG, throwable.getMessage());
     }
 });
```
#### Get three hour forecast by Geographic Coordinates:
```java
 helper.getThreeHourForecastByGeoCoordinates(6.5244,3.3792, new ThreeHourForecastCallback() {
     @Override
     public void onSuccess(ThreeHourForecast threeHourForecast) {
         Log.v(TAG, "City/Country: "+ threeHourForecast.getCity().getName() + "/" + threeHourForecast.getCity().getCountry() +"\n"
                         +"Forecast Array Count: " + threeHourForecast.getCnt() +"\n"
                         //For this example, we are logging details of only the first forecast object in the forecasts array
                         +"First Forecast Date Timestamp: " + threeHourForecast.getList().get(0).getDt() +"\n"
                         +"First Forecast Weather Description: " + threeHourForecast.getList().get(0).getWeather().get(0).getDescription()+ "\n"
                         +"First Forecast Max Temperature: " + threeHourForecast.getList().get(0).getMain().getTempMax()+"\n"
                         +"First Forecast Wind Speed: " + threeHourForecast.getList().get(0).getWind().getSpeed() + "\n"
         );
     }

     @Override
     public void onFailure(Throwable throwable) {
         Log.v(TAG, throwable.getMessage());
     }
 });
```
#### Get three hour forecast by Zip Code:
```java
 helper.getThreeHourForecastByZipCode("94040", new ThreeHourForecastCallback() {
     @Override
     public void onSuccess(ThreeHourForecast threeHourForecast) {
         Log.v(TAG, "City/Country: "+ threeHourForecast.getCity().getName() + "/" + threeHourForecast.getCity().getCountry() +"\n"
                         +"Forecast Array Count: " + threeHourForecast.getCnt() +"\n"
                         //For this example, we are logging details of only the first forecast object in the forecasts array
                         +"First Forecast Date Timestamp: " + threeHourForecast.getList().get(0).getDt() +"\n"
                         +"First Forecast Weather Description: " + threeHourForecast.getList().get(0).getWeather().get(0).getDescription()+ "\n"
                         +"First Forecast Max Temperature: " + threeHourForecast.getList().get(0).getMain().getTempMax()+"\n"
                         +"First Forecast Wind Speed: " + threeHourForecast.getList().get(0).getWind().getSpeed() + "\n"
         );
     }

     @Override
     public void onFailure(Throwable throwable) {
         Log.v(TAG, throwable.getMessage());
     }
 });
```





### Upcoming Features
1. Hourly Forecast 4 days
2. Daily Forecast 16 days
