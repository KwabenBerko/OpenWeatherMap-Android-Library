## OpenWeatherMap-Android-Library

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
compile 'com.github.KwabenBerko:OpenWeatherMap-Android-Library:v1.1.0'
```

**Note: Remember to include the INTERNET permission to your manifest file**

## Usage

#### Instantiate the OpenWeatherMapHelper class

``` java 
OpenWeatherMapHelper helper = new OpenWeatherMapHelper();
```
#### Set your API Key (Required) 

``` java 
helper.setApiKey(getString(R.string.OPEN_WEATHER_MAP_API_KEY));
```

#### Set your Units (Optional, fahrenheit by default) 

``` java 
helper.setUnits(Units.IMPERIAL);
```

##### Unit Options: 

1. ```Units.IMPERIAL```

2. ```Units.FAHRENHEIT```


## Features


### 1. Current Weather
#### Get current weather by City Name:

```java
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
```

#### Get current weather by City ID:
```java
        helper.getCurrentWeatherByCityID("524901", new OpenWeatherMapHelper.CurrentWeatherCallback() {
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

```
#### Get current weather by Geographic Coordinates:

```java
   helper.getCurrentWeatherByGeoCoordinates(5.6037, 0.1870, new OpenWeatherMapHelper.CurrentWeatherCallback() {
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

```
#### Get current weather by Zip Code:
```java
helper.getCurrentWeatherByZipCode("90003", new OpenWeatherMapHelper.CurrentWeatherCallback() {
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

```
### 2. 5 day / 3 hour forecast
#### Get three hour forecast by City Name:
#### Get three hour forecast by City ID:
#### Get three hour forecast by Geographic Coordinates:
#### Get three hour forecast by Zip Code:


### Upcoming Features
1. 16 day / daily forecast 
