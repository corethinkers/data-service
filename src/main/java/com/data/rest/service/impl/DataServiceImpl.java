/**
 * 
 */
package com.data.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.data.rest.db.entity.InvoiceInfo;
import com.data.rest.db.repository.InvoiceRepository;
import com.data.rest.dto.InvoiceJsonDTO;
import com.data.rest.service.IDataService;
import com.data.utils.DateUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author
 */
@Service
public class DataServiceImpl implements IDataService {

	@Autowired
	private InvoiceRepository  invoiceRepository;

	@Override
	public List getInvoiceDetailsById(String id) {
		return invoiceRepository.getInvoiceDetailsBYID(id);
	}

	@Override
	public List getInvoiceDetailsByInvoiceNumber(String invoiceNumber) {
		return invoiceRepository.getInvoiceDetailsBYInvoiceNumber(invoiceNumber);
	}

	@Override
	public List getInvoiceDetailsByInvoiceStatus(String status) {
		return invoiceRepository.getInvoiceDetailsBYStatus(status);
	}

	@Override
	public List getInvoiceDetailsByInvoiceGenerationDate(String startDate, String endDate) {
		return invoiceRepository.getInvoiceDetailsBYInvoiceGenerationDate(startDate, endDate);
	}
	
	/**
	 * @see com.data.rest.service.IDataService#getAllInvoiceData()
	 */
	@Override
	public List<InvoiceJsonDTO> getAllInvoiceData() {
		ObjectMapper objectMapper = new ObjectMapper();
		List<InvoiceJsonDTO> listOfInvoiceJsonDTO = new ArrayList<InvoiceJsonDTO>();
		List<InvoiceInfo> result = invoiceRepository.findAll();
		result.forEach(InvoiceInfo -> {
			InvoiceJsonDTO invoiceJsonDTO;
			try {
				invoiceJsonDTO = objectMapper.readValue(InvoiceInfo.getInvoiceJson(), InvoiceJsonDTO.class);
				listOfInvoiceJsonDTO.add(invoiceJsonDTO);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
		return listOfInvoiceJsonDTO;
	}

	@Override
	public List getInvoiceDetailsByBillingAnalystCode(String code) {
		return invoiceRepository.getInvoiceDetailsByBillingAnalystCode(code);
	}

	@Override
	public List getInvoiceDetailsByCustomerType(String type) {
		return invoiceRepository.getInvoiceDetailsByCustomerType(type);
	}

	@Override
	public List getInvoiceDetailsByGroupNumber(String groupNumber) {
		return invoiceRepository.getInvoiceDetailsByGroupNumber(groupNumber);
	}

	@Override
	public List getGroupDetailsByAmountRange(double startRange, double endRange) {
		return invoiceRepository.getGroupDetailsByAmountRange(startRange, endRange);
	}

	@Override
	public List getMemberDetailsByFirstName(String firstName) {
		return invoiceRepository.getMemberDetailsByFirstName(firstName);
	}

	@Override
	public List getMemberDetailsByLastName(String lastName) {
		return invoiceRepository.getMemberDetailsByLastName(lastName);
	}

	@Override
	public List getMemberDetailsByMemberId(String memberId) {
		return invoiceRepository.getMemberDetailsByMemberId(memberId);
	}
	
		public void checkScheduler(){
				
	}

	
	
	
	
	
}
