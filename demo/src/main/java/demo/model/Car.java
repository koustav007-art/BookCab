package demo.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Car {
	@Id
	@Column
	private String id;
	
	@Column
	private String driverId;
	
	@Column
	private Type type;
	
	
	@Column
	private Boolean availavle;
	
	@Column
	private Location currLocation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Boolean getAvailavle() {
		return availavle;
	}

	public void setAvailavle(Boolean availavle) {
		this.availavle = availavle;
	}

	public Location getCurrLocation() {
		return currLocation;
	}

	public void setCurrLocation(Location currLocation) {
		this.currLocation = currLocation;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String carId) {
		this.driverId = carId;
	}

	public Car(String id, String driverId, Type type, Boolean availavle, Location currLocation) {
		super();
		this.id = id;
		this.driverId = driverId;
		this.type = type;
		this.availavle = availavle;
		this.currLocation = currLocation;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(Location location) {
		this.setCurrLocation(location);
	}


	
	
}
