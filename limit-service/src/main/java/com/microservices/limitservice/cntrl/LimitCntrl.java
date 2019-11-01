package com.microservices.limitservice.cntrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitservice.bean.Limitconfiguration;
import com.microservices.limitservice.configuration.Configuration;

@RestController
public class LimitCntrl {
	
	@Autowired
	Configuration configuration;
	
	@RequestMapping("/limits")
	public Limitconfiguration getconfig() {
		return new Limitconfiguration(configuration.getMin() ,configuration.getMax());
	}

}
