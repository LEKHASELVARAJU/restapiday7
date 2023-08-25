package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepo;

@Service
public class ApiService {
	@Autowired 
	CarRepo cr;
	public Car posting(Car c)
	{
		return cr.save(c);
	}
	public List<Car> gett()
	{
		return cr.findAll();
	}
	public List<Car> get(int i)
	{
		return cr.getDetail(i);
	}
	
	

}
