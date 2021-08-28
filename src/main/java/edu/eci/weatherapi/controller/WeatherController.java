package edu.eci.weatherapi.controller;

import edu.eci.weatherapi.data.document.Weather;
import edu.eci.weatherapi.data.dto.WeatherDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/weather")
public class WeatherController {

    @PostMapping
    public Weather createWeather(@RequestBody WeatherDto weatherDto){
        return new Weather(weatherDto);
    }

    @GetMapping("/{id}")
    public Weather findWeatherById(@PathVariable String id ){
        return null;
    }


    @DeleteMapping("/{id}")
    public boolean deleteWeatherById(@PathVariable String id){
        return false;
    }

    @PutMapping("/{id}")
    public Weather updateWeatherByid(@PathVariable String id){
        return null;
    }


}
