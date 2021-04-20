/**
 * 
 */
package com.examples.bpm.camunda.tasks.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.examples.bpm.camunda.rest.model.RequestDetails;
import com.examples.bpm.camunda.rest.service.RestTemplateHelper;

/**
 * @author sunny
 *
 */
public class RestCallExampleProcessService {

	 
	private String url;
	private RestCallExampleProcessConf configuration;
	
	public RestCallExampleProcessService(String url, RestCallExampleProcessConf configuration) {
		this.url = url;
		this.configuration = configuration;
	}
	
	public RestCallExampleProcessResponse getEmployeeList() {	
		RestTemplateHelper restTemplateHelper = new RestTemplateHelper();
		
		 Object[] arguments = {
	                new Integer(2)


	        };
	        RequestDetails request = new RequestDetails();
	        request.setClazz(RestCallExampleProcessResponse.class);
	        request.setUrl(url+"/employees");
	        request.setUriVariables(arguments);
	        request.setHeader(true);
	        request.setHeaders(null);
	        RestCallExampleProcessResponse customResponse = restTemplateHelper.getForEntity(request);
	        System.out.println(customResponse.toString());
	        return customResponse;
		
	}
	
	public RestCallExampleProcessEmployeeResponse getEmployeeById(String id) {	
		RestTemplateHelper restTemplateHelper = new RestTemplateHelper();
		
		 Object[] arguments = {
	                new Integer(2)


	        };
	        RequestDetails request = new RequestDetails();
	        request.setClazz(RestCallExampleProcessEmployeeResponse.class);
	        request.setUrl(url+"/employee/"+id);
	        request.setUriVariables(arguments);
	        request.setHeader(true);
	        request.setHeaders(null);
	        RestCallExampleProcessEmployeeResponse customResponse = restTemplateHelper.getForEntity(request);
	        System.out.println(customResponse.toString());
	        return customResponse;
		
	}
}
