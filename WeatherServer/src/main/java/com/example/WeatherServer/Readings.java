package com.example.WeatherServer;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="readings")
public class Readings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Egypt")
    private Timestamp entrytime;
    private double temperature;
    private double ground_temperature;
    private double humidity;
    private double wind_speed;
    private double wind_direction;
    private double rainfall;

    public Readings(double temperature,
                    double ground_temperature,
                    double humidity,
                    double wind_speed,
                    double wind_direction,
                    double rainfall) {
        this.temperature = temperature;
        this.ground_temperature = ground_temperature;
        this.humidity = humidity;
        this.wind_speed = wind_speed;
        this.wind_direction = wind_direction;
        this.rainfall = rainfall;
    }

    public Readings(int id,
                    Timestamp entrytime,
                    double temperature,
                    double ground_temperature,
                    double humidity,
                    double wind_speed,
                    double wind_direction,
                    double rainfall) {
        this.id = id;
        this.entrytime = entrytime;
        this.temperature = temperature;
        this.ground_temperature = ground_temperature;
        this.humidity = humidity;
        this.wind_speed = wind_speed;
        this.wind_direction = wind_direction;
        this.rainfall = rainfall;
    }

    public Readings() {
    }

    public Timestamp getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Timestamp entrytime) {
        this.entrytime = entrytime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getGround_temperature() {
        return ground_temperature;
    }

    public void setGround_temperature(double ground_temperature) {
        this.ground_temperature = ground_temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public double getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(double wind_direction) {
        this.wind_direction = wind_direction;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }
}
