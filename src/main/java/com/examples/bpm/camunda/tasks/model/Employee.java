/**
 * 
 */
package com.examples.bpm.camunda.tasks.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunny
 *
 */
@Data
public class Employee {
	 int id;
	    String employee_name;
	    String profile_image;
	    int employee_age;
	    double employee_salary;
}
