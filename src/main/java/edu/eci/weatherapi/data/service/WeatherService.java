package edu.eci.weatherapi.data.service;

import edu.eci.weatherapi.data.document.Weather;

public interface WeatherService {

    Weather create(Weather weather);

    Weather updateById(Weather weather, String id);

    boolean deleteById(Weather weather, String id);

    Weather findById();
}
