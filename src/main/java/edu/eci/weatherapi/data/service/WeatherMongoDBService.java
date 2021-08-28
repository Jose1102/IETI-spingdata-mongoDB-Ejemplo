package edu.eci.weatherapi.data.service;

import edu.eci.weatherapi.data.document.Weather;
import edu.eci.weatherapi.data.dto.WeatherDto;
import edu.eci.weatherapi.data.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherMongoDBService implements WeatherService{


    private final WeatherRepository weatherRepository;

    public WeatherMongoDBService(@Autowired WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    public Weather create(Weather weather) {
        return weatherRepository.save( weather );
    }

    @Override
    public Weather updateById(WeatherDto weatherDto, String id) {
        if(weatherRepository.existsById( id )){
            Weather tempWeather = weatherRepository.findById(id).get();
            tempWeather.update(weatherDto);
            weatherRepository.save(tempWeather);
            return tempWeather;
        }
         return null;
    }

    @Override
    public boolean deleteById(String id) {
        if(weatherRepository.existsById(id)){
            weatherRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Weather findById(String id) {

        return weatherRepository.findById(id).orElse(null);
    }
}
