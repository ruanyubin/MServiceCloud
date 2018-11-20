package com.ruanyb.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ruanyb.springcloud.entities.Dept;

@RestController
public class DeptController_consumer {
	
	private static final String REST_URL_PREFIX = "http://MSERVICECLOUD-DEPT";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/dept/get/{id}", method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/1", Dept.class);
	}
	
	@RequestMapping(value="/consumer/dept/add")
	public boolean add() {
		Dept dept = new Dept();
		dept.setDname("测试部");
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value="/consumer/dept/list", method=RequestMethod.GET)
	public List<Dept> list(){
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);	
	}
}
