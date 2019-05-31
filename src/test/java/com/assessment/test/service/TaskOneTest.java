package com.assessment.test.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
//import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
//import static org.mockito.Mockito.mock;

//import static org.mockito.Mockito.*;
import org.json.JSONException;
import org.json.JSONObject;

import com.assessment.cib.CibApplication;
import com.assessment.cib.service.TaskOneService;



@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CibApplication.class)
@SpringBootTest
public class TaskOneTest{

	@Autowired
	private TaskOneService taskOne;
	
	
	//list all dog breeds
	@Test
	public void listAllBreedsTest() throws JSONException{
		
		String jsonString = taskOne.getHttpJson("breeds/list/all");
		JSONObject obj = new JSONObject(jsonString);
		
		assertEquals(obj.get("status"), "success");
		
	}
	
	//Verify that retriever is within the JSON response
		@Test
		public void verifyRetriver() throws JSONException{
			
			String jsonString = taskOne.getHttpJson("breeds/list/all");
			JSONObject obj = new JSONObject(jsonString);
			
			assertThat("retriever is not found", obj.getJSONObject("message").has("retriever"), is(true));
			
		}
	
	
	//Test Sub breed
	@Test
	public void listSubRetriver() throws JSONException{
		String jsonString = taskOne.getHttpJson("breed/retriever/list");
		JSONObject obj = new JSONObject(jsonString);
		
		assertEquals(obj.get("status"), "success");
	}
	
	
	//Test Random images
	public void randomImages() throws JSONException{
		String jsonString = taskOne.getHttpJson("breed/retriever/golden/images/random");
		JSONObject obj = new JSONObject(jsonString);
		
		assertEquals(obj.get("status"), "success");
	}
	
	
	
	
	
	
	
	
	
	

}
