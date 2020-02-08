/**
 * 
 */
package com.data.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 
 */
@RestController
@RequestMapping("/data/")
public class DataServiceController {

	/**
	 * @apiNote API is responsible to add data into database.
	 */
	@PostMapping("add")
	public void addData(){
		
	}
}
