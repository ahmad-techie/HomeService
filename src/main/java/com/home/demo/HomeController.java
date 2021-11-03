package com.home.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	List<Device> devices = new ArrayList<>();
	
	Device fridge = new Device(1, "Fridge");
	Device washer = new Device(1, "Washer");
	Device ac = new Device(1, "AC");
	Device tv = new Device(1, "TV");
	
	@GetMapping("/homes")
	public List<Home> homes() {
		return null; 
	}
}
