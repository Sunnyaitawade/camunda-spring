/**
 * 
 */
package com.examples.bpm.camunda.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.examples.bpm.camunda.tasks.GreetingsDelegate;
import com.examples.bpm.camunda.tasks.RestDelegate;

/**
 * @author sunny
 *
 */
@Configuration
public class RestDelegateConfiguration {
	
	@Value("${url}")
	private String url;
	 
	
	@Bean
	public RestDelegate restDelegate() {
		return new RestDelegate(url);
	}

}
