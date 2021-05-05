package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ServingWebContentApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServingWebContentApplication.class);
	}
	

    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }
    
    @RequestMapping("/")
    String helloWorld( ) {
    	return "Hello World!";
    }

}
