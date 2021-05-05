package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ServingWebContentApplication extends SpringBootServletInitializer{
	
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServingWebContentApplication.class);
	}*/
	

    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }
    
    @RequestMapping("/serving-web-content-0.0.1-SNAPSHOT")
    String helloWorld() {
    //public String index() {
    	return "Hello World This is Sumbo Capstone Project!";
    }

}
