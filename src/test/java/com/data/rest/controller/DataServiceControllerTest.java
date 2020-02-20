package com.data.rest.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@WebMvcTest(DataServiceController.class)
public class DataServiceControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private DataServiceController dataServiceController;

	@Test
	public void testGetAllInvoiceData() throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/list")
				    .contentType(MediaType.APPLICATION_JSON))
	               .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetinvoiceDetailsById() throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/invoiceById/{id}","test")
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetinvoiceDetailsByInvoiceNumber() throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/invoiceByInvoiceNumber/{invoiceNumber}","1234")
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetinvoiceDetailsByStatus()  throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/invoiceByStatus/{status}","active")
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetinvoiceDetailsByInvoiceGenerationDate()  throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/invoiceByInvoiceGenerationDate/{startDate}/{endDate}","2020-04-05","2020-10-10")
				.contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetinvoiceDetailsByBillingAnalystCode() throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/searchInvoiceByBillingAnalystCode/{code}","zp")
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetinvoiceDetailsByGroupNumber() throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/searchInvoiceByGroupNumber/{groupNumber}","ZIP1005")
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetinvoiceDetailsByCustomerType() throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/searchInvoiceByCustomerType/{type}","GROUPDDC")
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetGroupDetailsByAmountRange()  throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/searchGroupDetailsByAmountRange/{startRange}/{endRange}",5.2,2.3)
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}
	
	@Test
	public void testGetMemberDetailsByFirstName()  throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/searchMemberinfoByFirstName/{firstName}","ZIP1")
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetMemberDetailsByLastName() throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/searchMemberinfoByLastName/{lastName}","THINK")
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetMemberDetailsByMemberId()  throws Exception {
		MvcResult mvcResult =mockMvc.perform(get("/json/get/searchMemberinfoByMemberId/{id}","BE003148056A")
			    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
		
		Assert.assertEquals(200, mvcResult.getResponse().getStatus());
	}
	
}
