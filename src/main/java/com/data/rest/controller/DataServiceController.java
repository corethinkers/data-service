package com.data.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.rest.dto.InvoiceJsonDTO;
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

	@GetMapping("get/list")
	public @ResponseBody List<InvoiceJsonDTO> getAllInvoiceData() {
		return dataService.getAllInvoiceData();
	}
	
	@GetMapping("get/invoiceById/{id}")
	public @ResponseBody List  getinvoiceDetailsById(@PathVariable("id") String id) {
		return dataService.getInvoiceDetailsById(id);
	}
	
	@GetMapping("get/invoiceByInvoiceNumber/{invoiceNumber}")
	public @ResponseBody List  getinvoiceDetailsByInvoiceNumber(@PathVariable("invoiceNumber") String invoiceNumber) {
		return dataService.getInvoiceDetailsByInvoiceNumber(invoiceNumber);
	}
	
	@GetMapping("get/invoiceByStatus/{status}")
	public @ResponseBody List  getinvoiceDetailsByStatus(@PathVariable("status") String status) {
		return dataService.getInvoiceDetailsByInvoiceStatus(status);
	}
	
	@GetMapping("get/invoiceByInvoiceGenerationDate/{startDate}/{endDate}")
	public @ResponseBody List  getinvoiceDetailsByInvoiceGenerationDate(@PathVariable("startDate") String startDate,@PathVariable("endDate") String endDate) {
		return dataService.getInvoiceDetailsByInvoiceGenerationDate(startDate, endDate);
	}
	
	@GetMapping("get/searchInvoiceByBillingAnalystCode/{code}")
	public @ResponseBody List  getinvoiceDetailsByBillingAnalystCode(@PathVariable("code") String code) {
		return dataService.getInvoiceDetailsByBillingAnalystCode(code);
	}
	
	@GetMapping("get/searchInvoiceByGroupNumber/{groupNumber}")
	public @ResponseBody List  getinvoiceDetailsByGroupNumber(@PathVariable("groupNumber") String groupNumber) {
		return dataService.getInvoiceDetailsByGroupNumber(groupNumber);
	}
	
	@GetMapping("get/searchInvoiceByCustomerType/{type}")
	public @ResponseBody List  getinvoiceDetailsByCustomerType(@PathVariable("type") String type) {
		return dataService.getInvoiceDetailsByCustomerType(type);
	}
	
	@GetMapping("get/searchGroupDetailsByAmountRange/{startRange}/{endRange}")
	public @ResponseBody List  getGroupDetailsByAmountRange(@PathVariable("startRange") double startRange,@PathVariable("endRange") double endRange) {
		return dataService.getGroupDetailsByAmountRange(startRange, endRange);
	}
	
	@GetMapping("get/searchMemberinfoByFirstName/{firstName}")
	public @ResponseBody List  getMemberDetailsByFirstName(@PathVariable("firstName") String firstName) {
		return dataService.getMemberDetailsByFirstName(firstName);
	}
	
	@GetMapping("get/searchMemberinfoByLastName/{lastName}")
	public @ResponseBody List  getMemberDetailsByLastName(@PathVariable("lastName") String lastName) {
		return dataService.getMemberDetailsByLastName(lastName);
	}
	
	@GetMapping("get/searchMemberinfoByMemberId/{id}")
	public @ResponseBody List  getMemberDetailsByMemberId(@PathVariable("id") String id) {
		return dataService.getMemberDetailsByMemberId(id);
	}
}
