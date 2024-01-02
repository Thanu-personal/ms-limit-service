package learn.microservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.microservice.limitservice.bean.Limit;
import learn.microservice.limitservice.configuration.LimitConfiguration;

@RestController
public class LimitController {
	
	@Autowired
	LimitConfiguration limitConfiguration;
	
	@GetMapping("/limits")
	public Limit getLimits() {
		
		return new Limit(limitConfiguration.getMinimum(),limitConfiguration.getMaximum());
	}

}
