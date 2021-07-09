package demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Car;
import demo.model.Driver;
import demo.model.Person;
import demo.service.CabService;

@RestController
public class BookingController {
	
	@Autowired
	private CabService cabService;

	@RequestMapping(value="/registerUser", method=RequestMethod.POST)  
    public Person persistUser(@RequestBody Person person) {
	return cabService.createPerson(person);
	}
	
	
	@RequestMapping(value="/registerDriver", method=RequestMethod.POST)  
    public Driver persistDriver(@RequestBody Driver driver) {
		return cabService.createDriver(driver);
	}
	
	
	@RequestMapping(value="/registerCab", method=RequestMethod.POST)  
    public Car persistCar(@RequestBody Car cab) {
		return cabService.createCar(cab);
	}
	
	
	@RequestMapping(value="/book", method=RequestMethod.POST)  
    public Car book(@RequestBody Person person) {
		return cabService.bookCab(person);
	}
	
}
