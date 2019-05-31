package com.assessment.cib.service;

import java.net.URI;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TaskOneService{
	
	@Autowired
	private RestTemplate restTemplate;
	private String BASE_URL = "https://dog.ceo/api/";
	
	
	//Get http request
	public String getHttpJson(String path){
		
		HttpHeaders headers = new HttpHeaders(); //http header
		URI url = URI.create(BASE_URL + path); //create url from baseurl
		
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	     
	    return restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
	 
	}
	
	
	//Post Metho
	
	
	
	
	
	
	
	
	
	


}
