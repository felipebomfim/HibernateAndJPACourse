package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


@RestController
public class CurrencyConfigurationController {
	
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
//	@GetMapping("/")
//	public RedirectView index () {
//		return new RedirectView("currency-configuration");
//	}
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveCurrencyConfiguration(){
		return configuration;
	}
	
	
}
