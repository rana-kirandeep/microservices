package com.microservices.exchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.exchangeservice.bean.ExchangeRates;


@Repository
public interface ExchangeRepository extends JpaRepository<ExchangeRates, Long>{
	
	ExchangeRates findByFromAndTo(String from,String to);
}
