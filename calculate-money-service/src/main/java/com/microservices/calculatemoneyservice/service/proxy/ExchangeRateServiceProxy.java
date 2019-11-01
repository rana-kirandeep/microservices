package com.microservices.calculatemoneyservice.service.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microservices.calculatemoneyservice.bean.CalculateCurrencyBean;


//@FeignClient(name="exchange-service",url="http://localhost:9990")
//@FeignClient(name="exchange-service")
@FeignClient(name="zuul.api-gateway")
@RibbonClient(name="exchange-service")
public interface ExchangeRateServiceProxy {
	
	@RequestMapping("exchange-service/exchange/from/{from}/to/{to}/currency")
	public CalculateCurrencyBean getExchangeRate(@PathVariable("from") String from,
			@PathVariable("to") String to);
	
}
	

