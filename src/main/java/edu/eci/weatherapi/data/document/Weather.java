package edu.eci.weatherapi.data.document;

import edu.eci.weatherapi.data.dto.WeatherDto;

import java.util.Date;
import java.util.UUID;

public class Weather {

    private String id;
    private String description;
    private double temperature;
    private Date time;
    private String location;

    public Weather(WeatherDto weatherDto) {
        id = UUID.randomUUID().toString();
        description = weatherDto.getDescription();
        temperature = weatherDto.getTemperature();
        time = weatherDto.getTime();
        location = weatherDto.getLocation();
    }


}
