package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Car;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
@Autowired
ApiService ar;
@PostMapping("/")
public Car post(@RequestBody Car c)
{
	return ar.posting(c);
}
@GetMapping("q/{id}")
public List<Car> get(@PathVariable int id)
{
	return ar.get(id);
}
@GetMapping("/")
public List<Car> getting()
{
	return ar.gett();
}

}
