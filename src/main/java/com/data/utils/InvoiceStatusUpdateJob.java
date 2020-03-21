/**
 * 
 */
package com.data.utils;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.data.rest.db.entity.InvoiceInfo;
import com.data.rest.db.repository.InvoiceRepository;

@Component
public class InvoiceStatusUpdateJob {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	private List<String> holidayList;
	
	@Scheduled(fixedRateString = "${invoice.update.scheduler.time}")
	public void jobRunner(){
		//invoiceRepository.getInvoiceByStatus();
		List<InvoiceInfo> invoiceInfo = new ArrayList<>(); 
		//null check
		invoiceInfo.stream().forEach(invoice -> {
			String dt = DateUtils.adding24Hours(invoice.getInvoiceCreatedDate());
			if(!DateUtils.isWeekend(dt) && !holidayList.contains(dt)){
				//updateStatus
			}
		});
	}
	
	public List<String> getHolidayList(){
		holidayList = getHolidayList();
	    final String uri = "https://aw-lx0244:19586/swagger-ui.html#/content-management-controller/searchContentsUsingGET";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
		//manupulation     
		return null;
	}
	
}
