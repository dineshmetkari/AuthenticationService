package com.stackroute.assessmentengine.authenticationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



import com.stackroute.assessmentengine.authenticationservice.domain.Student;
import com.stackroute.assessmentengine.authenticationservice.domain.StudentRepository;
import com.stackroute.assessmentengine.authenticationservice.domain.User;
import com.stackroute.assessmentengine.authenticationservice.domain.UserRepository;

@SpringBootApplication
public class SpringReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner studentDemo(com.stackroute.assessmentengine.authenticationservice.domain.StudentRepository repository,  com.stackroute.assessmentengine.authenticationservice.domain.UserRepository urepository) {
		return (args) -> {
			com.stackroute.assessmentengine.authenticationservice.domain.User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			User user3 = new User("admin1", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			urepository.save(user3);
	    	
	        repository.save(new Student("John", "Johnson", "john@john.com"));
	        repository.save(new Student("Mary", "Poppins", "pop@mary.com"));
	        repository.save(new Student("Rob", "Robber", "rob@bery.com"));
	        repository.save(new Student("Kate", "Robinson", "kate@robinson.com"));
	    };
	}	
}
