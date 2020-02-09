package com.data.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.rest.db.entity.CustomerInfo;
import com.data.rest.service.IDataService;

/**
 * @author 
 */
@RestController
@RequestMapping("/data/")
public class DataServiceController {

	@Autowired
	private IDataService dataService;
	
	/**
	 * @apiNote API is responsible to add data into database.
	 */
	@PostMapping("add")
	public void addData(){
		
	}
	
	@GetMapping("test")
	public List<CustomerInfo> getData(){
		return dataService.getAllInfo();
	}
}
