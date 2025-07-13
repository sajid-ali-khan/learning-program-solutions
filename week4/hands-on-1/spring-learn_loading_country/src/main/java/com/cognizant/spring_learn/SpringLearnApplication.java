package com.cognizant.spring_learn;

import com.cognizant.spring_learn.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		try{
			displayDate("13/12/2018");
			displayCountry();
		} catch (ParseException e) {
            LOGGER.info(e.getMessage());
        }
    }

	public static void displayDate(String dateString) throws ParseException {
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		var format = context.getBean("dateFormat", SimpleDateFormat.class);

		var date = format.parse(dateString);
		LOGGER.info(date.toString());

		LOGGER.info("END");
	}

	public static void displayCountry(){
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countries = (List<Country>) context.getBean("countries");

		for (var country: countries){
			LOGGER.info(country.toString());
		}

		LOGGER.info("END");
	}

}
