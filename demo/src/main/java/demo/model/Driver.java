package demo.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Driver {

	@Id
	@Column
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String carId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}
	
	
	
	
}
