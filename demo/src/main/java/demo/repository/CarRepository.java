package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import demo.model.Car;


public interface CarRepository extends JpaRepository<Car, String>{

}
