package io.javabrains.controller;

import java.util.Arrays;
import java.util.List;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.javabrains.model.Topic;
import io.javabrains.service.TopicService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService _topicService;
	
	//GET 
	@RequestMapping(value = "/v1/topic", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Topic> getAllTopics() {
		return _topicService.getAllTopics();
	}
	
	//GET 
	@RequestMapping(value = "/v1/topic/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Topic getTopic(@PathVariable String id) {
		return _topicService.getTopic(id);
	}	
	

	//post
	@RequestMapping(value = "/v1/topic", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addTopic(@RequestBody Topic topic) {
		_topicService.addTopic(topic);
		
	}
	
	
	//PATH
	@RequestMapping(value = "/v1/topic/{id}", method = RequestMethod.PATCH, headers = "Accept=application/json")
	public  ResponseEntity<?> updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		_topicService.updateTopic(id, topic);
		 return new ResponseEntity<Topic>(topic, HttpStatus.OK);
	}	
	 

}
