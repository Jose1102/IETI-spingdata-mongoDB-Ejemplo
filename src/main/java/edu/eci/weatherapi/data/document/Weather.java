package edu.eci.weatherapi.data.document;

import edu.eci.weatherapi.data.dto.WeatherDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document
public class Weather {

    @Id
    private String id;
    private String description;
    private double temperature;
    private Date time;
    private String location;

    public Weather() {
    }

    public Weather(WeatherDto weatherDto) {
        description = weatherDto.getDescription();
        temperature = weatherDto.getTemperature();
        time = weatherDto.getTime();
        location = weatherDto.getLocation();
    }


    public void update(WeatherDto weatherDto) {
        description = weatherDto.getDescription();
        temperature = weatherDto.getTemperature();
        time = weatherDto.getTime();
        location = weatherDto.getLocation();
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getTemperature() {
        return temperature;
    }

    public Date getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }
}
