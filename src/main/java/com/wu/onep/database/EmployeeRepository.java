package com.wu.onep.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wu.onep.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
