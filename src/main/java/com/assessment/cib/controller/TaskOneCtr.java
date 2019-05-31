package com.assessment.cib.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.cib.service.TaskOneService;


@RestController
public class TaskOneCtr{
	@Autowired
	private TaskOneService taskOne;
	
	
	@RequestMapping(value = "/list/breeds")
	public String getAllBreeds(){
	    return taskOne.getHttpJson("breeds/list/all");
	}
	
	@RequestMapping(value = "list/sub/{breed}",method = RequestMethod.GET)
	public String getByBreed(@PathVariable("breed") String breed){
		
		String path = "breed/"+ breed + "/list";
		return taskOne.getHttpJson(path);
		
	}
	
	
	@RequestMapping(value="random/images/{breed}/{subBreed}",method=RequestMethod.GET)
	public String getSubBreedImg(@PathVariable("breed") String breed, @PathVariable("subBreed") String subBreed){
		String path = "breed/" +breed +"/"+ subBreed + "/images/random";
		return taskOne.getHttpJson(path);
	}
	
	
	

}
