/**
 * 
 */
package com.examples.bpm.camunda.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.examples.bpm.camunda.tasks.model.RestCallExampleProcessConf;
import com.examples.bpm.camunda.tasks.model.RestCallExampleProcessResponse;
import com.examples.bpm.camunda.tasks.model.RestCallExampleProcessService;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author sunny
 *
 */

public class RestDelegate implements JavaDelegate {
	
    private String url;
	
	public RestDelegate(String url) {
		this.url = url;
	}
	@Override
	public void execute(DelegateExecution execution) throws Exception {	 
		 
        String empid = execution.getVariable("userId").toString();
        String name = execution.getVariable("name").toString();
        System.out.println("----------------------------"+empid+"-"+name);
        System.out.println("----------------------------");
        
        RestCallExampleProcessResponse responseEmployees =new RestCallExampleProcessService(url, new RestCallExampleProcessConf(empid, name)).getEmployeeList();
      
        
        System.out.println("----------------------------"+responseEmployees.toString());
        System.out.println("----------------------------");
        ObjectMapper mapper = new ObjectMapper();        
        String emplstStr = mapper.writeValueAsString(responseEmployees);
        execution.setVariable("employeelist", emplstStr);
        
        RestCallExampleProcessResponse responseEmployee =new RestCallExampleProcessService(url, new RestCallExampleProcessConf(empid, name)).getEmployeeList();
        String empStr = mapper.writeValueAsString(responseEmployee);
        execution.setVariable("employeebyid", empStr);
	}

}
