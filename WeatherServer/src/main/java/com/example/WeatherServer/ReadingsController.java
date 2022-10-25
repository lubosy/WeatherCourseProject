package com.example.WeatherServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ReadingsController {


    @Autowired
    public ReadingsRepo readingsRepo;

    @GetMapping("sendreadings")
    public ResponseEntity<?> saveNewData(@RequestBody Readings readings){
        readingsRepo.save(readings);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping("getReadings")
    public List<Readings> getTemperature(){
        return readingsRepo.findAll();
    }

    @GetMapping("currentReadings")
    public Readings getCurrentData(){
        return readingsRepo.findFirstByOrderByIdDesc();
    }
}
