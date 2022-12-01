package com.springBoot.thirdProject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.springBoot.thirdProject.Model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
