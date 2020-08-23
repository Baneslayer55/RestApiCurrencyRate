package com.currencyrateinfo.currencyrateinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class CurrencyRateInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyRateInfoApplication.class, args);
	}

}
