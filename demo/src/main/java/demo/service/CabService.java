package demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import demo.model.Car;
import demo.model.Driver;
import demo.model.Person;


@Service
public interface CabService {

	public Driver createDriver(Driver data);
	
	public Car createCar(Car data);
	
	public Person createPerson(Person data);
	
	public Car bookCab(Person data);
}
