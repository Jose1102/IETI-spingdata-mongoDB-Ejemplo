package edu.eci.weatherapi.data.repository;

import edu.eci.weatherapi.data.document.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherRepository extends MongoRepository<Weather, String> {
}
