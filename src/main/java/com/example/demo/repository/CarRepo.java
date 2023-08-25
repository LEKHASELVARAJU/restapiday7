package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {
	@Query(value="select * from Car where id=:s",nativeQuery = true)
	public List<Car> getDetail(@Param("s") int id);

}
