package com.examples.bpm.camunda.tasks.model;

import java.util.List;

import lombok.Data;

@Data
public class RestCallExampleProcessEmployeeResponse {
	 public String message;
	 public String status;
	 public  Employee  data;
}
