package demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person implements Serializable {

	@Id
	@Column
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String driverId;
	
	@Column
	private Location fromAddress;
	
	@Column
	private Location toAddress;

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

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public Location getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(Location fromAddress) {
		this.fromAddress = fromAddress;
	}

	public Location getToAddress() {
		return toAddress;
	}

	public void setToAddress(Location toAddress) {
		this.toAddress = toAddress;
	}

}
