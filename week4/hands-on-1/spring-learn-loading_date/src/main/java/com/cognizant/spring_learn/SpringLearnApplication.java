package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);
		try{
			var date = displayDate("31/12/2018");
			System.out.println("Parsed date: "+date.toString());
		}catch(ParseException e){
			System.out.println(e.getMessage());
		}
	}

	public static Date displayDate(String dateString) throws ParseException {
		ApplicationContext context =  new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        return format.parse(dateString);
	}
}
