package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import demo.model.Car;
import demo.model.Driver;
import demo.model.Location;
import demo.model.Person;
import demo.repository.CarRepository;
import demo.repository.DriverRepository;
import demo.repository.PersonRepository;

public class CabServiceImpl implements CabService{

	@Autowired
	CarRepository carRepo;
	
	@Autowired
	PersonRepository userRepo;
	
	@Autowired
	DriverRepository driverRepo;
	
	
	public Driver createDriver(Driver data) {
		driverRepo.save(data);
		return data;
	}

	public Car createCar(Car data) {
		carRepo.save(data);
		Driver driver = driverRepo.findById(data.getDriverId()).get();
		driver.setCarId(data.getId());
		driverRepo.save(driver);
		return data;
	}

	public Person createPerson(Person data) {
		userRepo.save(data);
		return data;
	}

	public Car bookCab(Person data) {
		List<Car> carList =  carRepo.findAll();
		Location loc = data.getFromAddress();
		
		Car car = new Car(new Location(0,0));
		
		for(Car c: carList) {
			if ((Math.sqrt(c.getCurrLocation().getX()-loc.getX()*c.getCurrLocation().getX()-loc.getX()) + c.getCurrLocation().getY()-loc.getY()*c.getCurrLocation().getY()-loc.getY())<Math.sqrt(car.getCurrLocation().getX()-loc.getX()*car.getCurrLocation().getX()-loc.getX()) + car.getCurrLocation().getY()-loc.getY()*car.getCurrLocation().getY()-loc.getY()) {
				car = c;
			}
		}
		
		return car;
	}

}
