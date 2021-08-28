package edu.eci.weatherapi.controller;

import edu.eci.weatherapi.data.document.Weather;
import edu.eci.weatherapi.data.dto.WeatherDto;
import edu.eci.weatherapi.data.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/weather")
public class WeatherController {


    private final WeatherService service;

    public WeatherController(@Autowired WeatherService service) {
        this.service = service;
    }

    @PostMapping
    public Weather createWeather(@RequestBody WeatherDto weatherDto){

        return service.create( new Weather(weatherDto));
    }

    @GetMapping( "/{id}")
    public Weather findWeatherById(@PathVariable String id ){

        return service.findById(id);
    }


    @DeleteMapping("/{id}")
    public boolean deleteWeatherById(@PathVariable String id){
        return service.deleteById(id);
    }

    @PutMapping("/{id}")
    public Weather updateWeatherByid(@RequestBody WeatherDto weatherDto ,@PathVariable String id){
        return service.updateById(weatherDto,id);
    }


}
