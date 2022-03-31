package com.springbootactuatorapp.controller;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootactuatorapp.model.Worker;
@RequestMapping("/worker")
@RestController
public class WorkerController {
	@GetMapping("/showWorker")
	public Worker showWorker() {
		return new Worker(1, "Sahil", "Mhabar", 4500, new Date(), "Comp","sahil@gmail.com");
	}
	
	@GetMapping("/all/showWorkers")
	public List<Worker> showWorkers() {
		return Arrays.asList(
				new Worker(1, "Pranit", "Patil", 5900, new Date(), "Comp","pranit@gmail.com"),
				new Worker(2, "Sourabh", "Kulkarni", 43000, new Date(), "Comp","sourabh@gmail.com"),
				new Worker(3, "Rudr", "Soni", 37000, new Date(), "Comp","rudr@gmail.com"));
	}
}