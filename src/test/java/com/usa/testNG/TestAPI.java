package com.usa.testNG;


import static io.restassured.RestAssured.given;                                                    
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.usa.utilty.commonMethods;

import io.restassured.RestAssured;                                                                 
import io.restassured.http.Method;                                                                 
import io.restassured.response.Response;                                                           
import io.restassured.specification.RequestSpecification;                                          
                                                                                                   
public class TestAPI {                                                                            
                                                                                                   
static	String domin = "https://jsonplaceholder.typicode.com";                                     
   // Could you please write the code get & post method by using BDD format like given when then api 
   // What is return status code of 500
   // What is return status code of 503
                                                     
	// @Test
	public void GetMethodRestAssuredBDD() {
		given().param("Content-Type", "application/json; charset=utf-8")
		.when()
		.get(domin + "/posts").
		then().statusCode(200).statusLine("HTTP/1.1 200 OK")
				.body("[1].title", equalTo("qui est esse"))
				.body("[3].title", equalTo("eum et est occaecati"))
				.header("Content-Encoding", "gzip").log().all();      }                                                                                      
     
	 @Test
	 public void getPostMethod() {		 
		// ArrayList <Integer> list = new ArrayList<Integer>();
		 
		 //JSONObject obj = new JSONObject();	 
		 
		  HashMap <String, String> data = new HashMap<String, String>();	  
		  data.put("Batch-No", "19");
		  data.put("CourseTitle", "Automation");
		  data.put("Company", "SmartTech");
		  data.put("Email", commonMethods.randomestring());
		  data.put("Contact", "716-500-0007");	
		  
		  
		  RestAssured.baseURI = domin;

		  
			given().contentType("application/json").
			body(data).when().post("/posts").
			then().statusCode(201).statusLine("HTTP/1.1 201 Created").and()
					.body("Batch-No", equalTo("19"))
					.and().body("Contact", equalTo ("716-500-0007")).log().all();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	// @Test                                                                                         
	public void GetMethodRestAssured() {                                                           
		// Request object                                                                          
		RequestSpecification httpRequest = RestAssured.given();                                    
		// Response object                                                                         
		Response response = httpRequest.request(Method.GET, domin +"/posts");                      
		// print response in console window                                                        
		String responseBody = response.getBody().asString();                                       
		System.out.println("Response Body is:" + responseBody);                                    
                                                                                                   
		// validating headers                                                                      
		String contentType = response.header("Content-Type");// capture details of Content-Type hea
		System.out.println("Content Type is:" + contentType);                                      
		Assert.assertEquals(contentType, "application/json; charset=utf-8");                       
                                                                                                   
		// success code validation                                                                 
		String title = response.jsonPath().get("[1].title");                                       
		Assert.assertEquals(title, "qui est esse");                                                
                                                                                                   
		String contentEncoding = response.header("Content-Encoding");// capture details of Content-
		System.out.println("Content Encoding is:" + contentEncoding);                              
		Assert.assertEquals(contentEncoding, "gzip");                                              
                                                                                                   
	}                                                                                              
}                                                                                                  
                                                                                                   
                                                                                                   
                                                                                                   

