package com.example.WeatherServer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReadingsRepo extends JpaRepository<Readings,Integer> {

   Readings findFirstByOrderByIdDesc();
}
