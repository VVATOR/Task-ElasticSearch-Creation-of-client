package com.epam.training;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.log4j.Logger;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;

import com.epam.training.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner {
	
	private static final Logger LOG = Logger.getLogger(Runner.class);

	public static void main(String[] args) {
		LOG.info("Start REST API client");
		try {
		RestClient restClient = RestClient.builder(
				new HttpHost("localhost", 9200, "http")
				).build();
		
		
		
		
		
		HttpEntity entity = new NStringEntity("");
		Response response = restClient.performRequest("GET" , "_search");
		LOG.info(response.getEntity().toString());
		
		
		//https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-put-mapping.html
		ObjectMapper mapper = new ObjectMapper();
		Date date = new Date();
		User user = new User("Vitaly", "Male", date, "10");
		String jsonInString = mapper.writeValueAsString(user);		
		entity = new NStringEntity(jsonInString, ContentType.APPLICATION_JSON);
		response = restClient.performRequest(
				"PUT" , 
				"/store/user/1",
				Collections.<String, String> emptyMap(),
		        entity);
		
		LOG.info(response.getEntity().toString());
		
		restClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LOG.info("Stop REST API client");
	}

}
