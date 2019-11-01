package com.microservices.exchangeservice.cntrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.exchangeservice.bean.ExchangeRates;
import com.microservices.exchangeservice.repo.ExchangeRepository;

@RestController
public class ExchangeCntrl {
	
	@Autowired
	Environment env;
	
	@Autowired
	ExchangeRepository repository;

	@RequestMapping("/exchange/from/{from}/to/{to}/currency")
	public ExchangeRates getExchangeRate(@PathVariable String from,
			@PathVariable String to) {
		
		ExchangeRates exchangeRates=repository.findByFromAndTo(from, to);
		exchangeRates.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		
		//return new ExchangeRates("AUD", "INR", new BigDecimal(65), 9990);
		return exchangeRates;
	}
}
