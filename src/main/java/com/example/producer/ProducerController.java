package com.example.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	
	@GetMapping("/getProducerDetails")
	public String getProducerDetails() {
		return "Producer service is working....!!!";
	}

}
