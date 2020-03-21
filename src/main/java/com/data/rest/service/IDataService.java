/**
 * 
 */
package com.data.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.rest.dto.InvoiceJsonDTO;


/**
 * @author
 */
@Service
public interface IDataService {

	List<InvoiceJsonDTO> getAllInvoiceData();
	
	List getInvoiceDetailsById(String id);
	
	List getInvoiceDetailsByInvoiceNumber(String invoiceNumber);
	
	List getInvoiceDetailsByInvoiceStatus(String status);
	
	List getInvoiceDetailsByInvoiceGenerationDate(String startDate,String endDate);
	
	List getInvoiceDetailsByBillingAnalystCode(String code);
	
	List getInvoiceDetailsByCustomerType(String type);
	
	List getInvoiceDetailsByGroupNumber(String groupNumber);
	
	List getGroupDetailsByAmountRange(double startRange, double endRange);

	List getMemberDetailsByFirstName(String firstName);
	
	List getMemberDetailsByLastName(String lastName);
	
	List getMemberDetailsByMemberId(String memberId);
	
}
