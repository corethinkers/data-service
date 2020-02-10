package com.data.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.rest.db.entity.ClassicTypeTest;
import com.data.rest.db.entity.IndexTestTable;
import com.data.rest.db.entity.LargeTestTable;
import com.data.rest.service.IDataService;

/**
 * @author
 */
@RestController
@RequestMapping("/json/")
public class DataServiceController {

	@Autowired
	private IDataService dataService;

	@PostMapping("add/classic")
	public ResponseEntity<ClassicTypeTest> addDataIntoClassicTypeTest(@RequestBody ClassicTypeTest classicTypeTest) {
		dataService.addDataIntoClassicTypeTest(classicTypeTest);
		return new ResponseEntity<>(classicTypeTest, HttpStatus.CREATED);
	}

	@GetMapping("classic/{customerId}")
	public @ResponseBody List<ClassicTypeTest> getFilterDataFromClassicTypeTest(@PathVariable("customerId") String id) {
		return dataService.getFilterDataFromClassicTypeTest(id);
	}
	
	@GetMapping("classic/all")
	public @ResponseBody List<ClassicTypeTest> getAllClassicData() {
		return dataService.getAllClassicTypeTest();
	}
	
	
	@PostMapping("add/indexTest")
	public ResponseEntity<IndexTestTable> addDataIntoIndexTestTable(@RequestBody IndexTestTable indexTestTable) {
		dataService.addDataIntoIndexTestTable(indexTestTable);
		return new ResponseEntity<>(indexTestTable, HttpStatus.CREATED);
	}

	@GetMapping("index/{customerId}")
	public @ResponseBody List<IndexTestTable> getFilterDataFromIndexTestTable(@PathVariable("customerId") String id) {
		return dataService.getFilterDataFromIndexTestTable(id);
	}

	@GetMapping("index/all")
	public @ResponseBody List<IndexTestTable> getAllIndexTestData() {
		return dataService.getAllIndexTestTable();
	}
	
	@PostMapping("add/large")
	public ResponseEntity<LargeTestTable> addDataIntoLargeTestTable(@RequestBody LargeTestTable largeTestTable) {
		dataService.addDataIntoLargeTestTable(largeTestTable);
		return new ResponseEntity<>(largeTestTable, HttpStatus.CREATED);
	}

	@GetMapping("large/{customerId}")
	public @ResponseBody List<LargeTestTable> getFilterDataFromLargeTestTable(@PathVariable("customerId") String id) {
		return dataService.getFilterDataFromLargeTestTable(id);
	}
	
	@GetMapping("large/all")
	public @ResponseBody List<LargeTestTable> getAllLargeData() {
		return dataService.getAllLargeTestTable();
	}

}
