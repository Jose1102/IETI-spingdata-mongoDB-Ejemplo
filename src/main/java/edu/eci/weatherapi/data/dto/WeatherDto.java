package edu.eci.weatherapi.data.dto;

import java.util.Date;

public class WeatherDto {

    private String description;
    private double temperature;
    private Date time;
    private String location;

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
