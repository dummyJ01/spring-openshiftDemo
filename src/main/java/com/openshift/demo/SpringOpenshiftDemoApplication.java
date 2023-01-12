package com.openshift.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftDemoApplication {
	
	@GetMapping("/")
	public String m1() {
		return "Welcome to openShift";
	}
	
	@GetMapping("/{input}")
	public String m2(@PathVariable String input) {
		return "Hi"+input+"your app deployed in openshift successfully..";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftDemoApplication.class, args);
	}

}
