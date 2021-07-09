package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, String>{

}
