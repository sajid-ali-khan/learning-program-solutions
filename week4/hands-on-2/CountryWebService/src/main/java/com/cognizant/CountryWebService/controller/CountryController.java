package com.cognizant.CountryWebService.controller;

import com.cognizant.CountryWebService.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CountryController {
    @GetMapping(value = "/hello", produces = "application/json")
    public Country getCountryIndia(){
        ApplicationContext context =  new ClassPathXmlApplicationContext("country.xml");

        return (Country) context.getBean("in");
    }
}
