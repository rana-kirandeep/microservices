package com.microservices.calculatemoneyservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.calculatemoneyservice.bean.CalculateCurrencyBean;
import com.microservices.calculatemoneyservice.service.proxy.ExchangeRateServiceProxy;

@RestController
public class CalculateCurrencyCntrl {
	
	@Autowired
	ExchangeRateServiceProxy exchangeRateServiceProxy;
	
	@GetMapping("calculate/from/{from}/to/{to}/currency/{quantity}")
	public CalculateCurrencyBean calculateCurrency(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		Map<String,String> varMap=new HashMap<String,String>();
		varMap.put("from",from);
		varMap.put("to",to);
		ResponseEntity<CalculateCurrencyBean> responseBody=
				new RestTemplate().getForEntity("http://localhost:9990/exchange/from/{from}/to/{to}/currency", CalculateCurrencyBean.class,varMap);
		
		CalculateCurrencyBean response=responseBody.getBody();
		response.setQuantity(quantity);
		response.setTotalCalculatedMoney(quantity.multiply(response.getExchangeRate()) );
		
		return response;
	}
	
	
	@GetMapping("calculate/feign/from/{from}/to/{to}/currency/{quantity}")
	public CalculateCurrencyBean calculateCurrencyFeign(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		CalculateCurrencyBean response=exchangeRateServiceProxy.getExchangeRate(from, to);
		response.setQuantity(quantity);
		response.setTotalCalculatedMoney(quantity.multiply(response.getExchangeRate()) );
		
		return response;
	}

}
