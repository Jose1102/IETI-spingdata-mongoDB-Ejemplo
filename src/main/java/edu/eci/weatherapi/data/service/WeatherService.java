package edu.eci.weatherapi.data.service;

import edu.eci.weatherapi.data.document.Weather;
import edu.eci.weatherapi.data.dto.WeatherDto;

public interface WeatherService {

    Weather create(Weather weather);

    Weather updateById(WeatherDto weatherDto, String id);

    boolean deleteById(String id);

    Weather findById(String id);
}
