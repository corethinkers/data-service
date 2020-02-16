package com.data.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.rest.db.entity.ClassicTypeTest;
import com.data.rest.dto.CoverageOption;
import com.data.rest.dto.Fee;
import com.data.rest.dto.InvoiceJsonDTO;
import com.data.rest.dto.MemberDetail;
import com.data.rest.service.IDataService;

/**
 * @author
 */
@RestController
@RequestMapping("/json/")
@CrossOrigin(origins = "*")
public class DataServiceController {

	@Autowired
	private IDataService dataService;

	@PostMapping("add/invoiceS")
	public ResponseEntity<ClassicTypeTest> addDataIntoClassicTypeTest(@RequestBody ClassicTypeTest classicTypeTest) {
		dataService.addDataIntoClassicTypeTest(classicTypeTest);
		return new ResponseEntity<>(classicTypeTest, HttpStatus.CREATED);
	}
	
	@GetMapping("get/invoice/list")
	public @ResponseBody List<InvoiceJsonDTO> getAllClassicData() {
		return dataService.getAllClassicTypeTest();
	}
	
	@GetMapping("get/invoice/fee/{divisionNumber}")
	public @ResponseBody List<Fee>  getFeeDetailsFromInvoiceByDivisionNumber(@PathVariable("divisionNumber") String divisionNumber) {
		return dataService.getFeeDetailsFromInvoiceByDivisionNumber(divisionNumber);
	}
	
	@GetMapping("get/invoice/memberdetail/{divisionNumber}")
	public @ResponseBody List<MemberDetail> getMemberDetailsFromInvoiceByDivisionNumber(@PathVariable("divisionNumber") String divisionNumber) {
		return dataService.getMemberDetailsFromInvoiceByDivisionNumber(divisionNumber);
	}

	@GetMapping("get/invoice/coverageoptions/{divisionNumber}")
	public @ResponseBody List<CoverageOption> getCoverageOptionsFromInvoiceByDivisionNumber(@PathVariable("divisionNumber") String divisionNumber) {
		return dataService.getCoverageOptionsFromInvoiceByDivisionNumber(divisionNumber);
	}
}
