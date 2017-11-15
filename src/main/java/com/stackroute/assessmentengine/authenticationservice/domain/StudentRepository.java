package com.stackroute.assessmentengine.authenticationservice.domain;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
}
