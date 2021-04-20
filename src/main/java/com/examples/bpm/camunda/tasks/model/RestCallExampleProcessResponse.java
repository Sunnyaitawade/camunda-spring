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
public class RestCallExampleProcessResponse {
	 public String message;
	 public String status;
	 public  List<Employee> data;
	 
}
