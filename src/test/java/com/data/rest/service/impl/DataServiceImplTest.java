package com.data.rest.service.impl;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.data.rest.db.entity.InvoiceInfo;
import com.data.rest.db.repository.InvoiceRepository;

@RunWith(MockitoJUnitRunner.class)
public class DataServiceImplTest {

	@Mock
	private InvoiceRepository  invoiceRepository;
	
	@InjectMocks
	private DataServiceImpl dataServiceImpl;
	
	@SuppressWarnings("unchecked")
	@Test
	public void testGetAllInvoiceData() {
		Mockito.when(invoiceRepository.findAll()).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getAllInvoiceData().size()> 0);
	}
	
	@Test
	public void testGetInvoiceDetailsById() {
		Mockito.when(invoiceRepository.getInvoiceDetailsBYID(Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getInvoiceDetailsById("1").size()> 0);
	}
		
	@Test
	public void testGetInvoiceDetailsByInvoiceNumber() {
		Mockito.when(invoiceRepository.getInvoiceDetailsBYInvoiceNumber(Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getInvoiceDetailsByInvoiceNumber("1").size()> 0);
	}

	@Test
	public void testGetInvoiceDetailsByInvoiceStatus() {
		Mockito.when(invoiceRepository.getInvoiceDetailsBYStatus(Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getInvoiceDetailsByInvoiceStatus("completed").size()> 0);
	}
	
	@Test
	public void testGetInvoiceDetailsByInvoiceGenerationDate() {
		Mockito.when(invoiceRepository.getInvoiceDetailsBYInvoiceGenerationDate(Mockito.anyString(), Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getInvoiceDetailsByInvoiceGenerationDate("2020-01-08","2020-02-17").size()> 0);
	}

	@Test
	public void testGetInvoiceDetailsByBillingAnalystCode() {
		Mockito.when(invoiceRepository.getInvoiceDetailsByBillingAnalystCode(Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getInvoiceDetailsByBillingAnalystCode("P1").size()> 0);
	}

	@Test
	public void testGetInvoiceDetailsByGroupNumber() {
		Mockito.when(invoiceRepository.getInvoiceDetailsByGroupNumber(Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getInvoiceDetailsByGroupNumber("ZIP106").size()> 0);
	}
	
	@Test
	public void testGetInvoiceDetailsByCustomerType() {
		Mockito.when(invoiceRepository.getInvoiceDetailsByCustomerType(Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getInvoiceDetailsByCustomerType("GROUPDDC").size()> 0);
	}

	@Test
	public void testGetGroupDetailsByAmountRange() {
		Mockito.when(invoiceRepository.getGroupDetailsByAmountRange(Mockito.anyDouble(),Mockito.anyDouble())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getGroupDetailsByAmountRange(5.0,10.0).size() > 0);
	}
	
	@Test
	public void testGetMemberDetailsByFirstName() {
		Mockito.when(invoiceRepository.getMemberDetailsByFirstName(Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getMemberDetailsByFirstName("mock").size()> 0);
	}
	
	@Test
	public void testGetMemberDetailsByLastName() {
		Mockito.when(invoiceRepository.getMemberDetailsByLastName(Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getMemberDetailsByLastName("mock").size()> 0);
	}
	
	@Test
	public void testGetMemberDetailsByMemberId() {
		Mockito.when(invoiceRepository.getMemberDetailsByMemberId(Mockito.anyString())).thenReturn(getInvoiceMockData());
		assertEquals(true, dataServiceImpl.getMemberDetailsByMemberId("mock").size()> 0);
	}

	@SuppressWarnings("rawtypes")
	private List getInvoiceMockData(){
		InvoiceInfo invoice = new InvoiceInfo();
		invoice.setId("1");
		invoice.setInvoiceCreatedDate("2020-01-08T16:50:35.0000000");
		invoice.setInvoiceNumber("BE003141000");
		invoice.setInvoiceStatus("completed");
		invoice.setInvoiceUpdatedDate("2020-02-17T16:50:56.0000000");
		invoice.setLastUpdatedBy("gimudia");
		invoice.setInvoiceJson("{\r\n  \"id\": \"BE003141000-2020-02-16-18:34:44\",\r\n"
				+ "  \"accountNumber\": \"05-BE003141000\",\r\n  \"billingAddress\": "
				+ "{\r\n    \"addressLine1\": \"\",\r\n    \"addressLine2\": \"\",\r\n  "
				+ "  \"addressLine3\": null,\r\n    \"city\": null,\r\n    \"state\": null,\r\n  "
				+ "  \"zipCode\": null\r\n  },\r\n  \"billingAnalystCode\": \"P1\",\r\n "
				+ " \"billToDivisionNumber\": \"00000\",\r\n  \"billToGroupNumber\": \"RZIP100\",\r\n "
				+ " \"coverageEndDate\": \"01/09/2020\",\r\n  \"coverageStartDate\": \"02/20/2020\",\r\n"
				+ "  \"customerType\": \"GROUPDDC\",\r\n  \"dualChoice\": false,\r\n "
				+ " \"financialCompanyName\": \"DDC\",\r\n  \"groupName\": \"NEW ZIP GROUP (ZIP DIVI DIFF EFF DATES)-NO SHARE\","
				+ "\r\n  \"groupSummary\": [\r\n    {\r\n      \"adjustmentAmount\": 0,\r\n   "
				+ "   \"amount\": 56,\r\n      \"billedAmount\": 0,\r\n    "
				+ "  \"descriptionOfCharges\": null,\r\n   "
				+ "   \"feeBasis\": null,\r\n      \"groupNumber\": \"ZIP106\",\r\n      \"numberOfClaimsPaid\": 0,\r\n   "
				+ "   \"numberOfEnrollees\": 8,\r\n      \"totalAmount\": 56,\r\n      \"unBilledAmount\": 0,\r\n    "
				+ "  \"coverageOptions\": [\r\n        {\r\n          \"amount\": 56,\r\n       "
				+ "   \"coverageOptionCode\": \"01\",\r\n          \"numberOfEnrollees\": 8,\r\n          \"rate\": 7\r\n    "
				+ "    }\r\n      ],\r\n      \"divisionSummary\": [\r\n        {\r\n          \"divisionNumber\": \"00001\",\r\n "
				+ "         \"numberOfEnrollees\": 5,\r\n          \"memberDetails\": [\r\n            {\r\n             "
				+ " \"amount\": 7,\r\n              \"assignedId\": \"\",\r\n            "
				+ "  \"coverageEffectiveDate\": \"02/20/2020\",\r\n              \"coverageOptionCode\": \"01\",\r\n        "
				+ "      \"premium\": null,\r\n              \"firstName\": \"ZIP1\",\r\n           "
				+ "   \"lastName\": \"KAYLA1\",\r\n              \"memberId\": \"152428069001\",\r\n             "
				+ " \"supplierId\": \"\"\r\n            },\r\n            {\r\n              \"amount\": 7,\r\n             "
				+ " \"assignedId\": \"\",\r\n              \"coverageEffectiveDate\": \"02/20/2020\",\r\n           "
				+ "   \"coverageOptionCode\": \"01\",\r\n              \"premium\": null,\r\n             "
				+ " \"firstName\": \"ZIP1\",\r\n              \"lastName\": \"KAYLA2\",\r\n              "
				+ "\"memberId\": \"152428069011\",\r\n              \"supplierId\": \"\"\r\n         "
				+ "   },\r\n         "
				+ "   {\r\n              \"amount\": 7,\r\n              \"assignedId\": \"\",\r\n           "
				+ "   \"coverageEffectiveDate\": \"02/20/2020\",\r\n             "
				+ " \"coverageOptionCode\": \"01\",\r\n              \"premium\": null,\r\n           "
				+ "   \"firstName\": \"ZIP2\",\r\n              \"lastName\": \"KAYLA3\",\r\n             "
				+ " \"memberId\": \"672929153331\",\r\n              \"supplierId\": \"\"\r\n            },\r\n       "
				+ "     {\r\n              \"amount\": 7,\r\n              \"assignedId\": \"\",\r\n          "
				+ "    \"coverageEffectiveDate\": \"02/20/2020\",\r\n           "
				+ "   \"coverageOptionCode\": \"01\",\r\n              \"premium\": null,\r\n             "
				+ " \"firstName\": \"ZIP2\",\r\n              \"lastName\": \"KAYLA4\",\r\n           "
				+ "   \"memberId\": \"672929153341\",\r\n              \"supplierId\": \"\"\r\n            },\r\n        "
				+ "    {\r\n              \"amount\": 7,\r\n              \"assignedId\": \"\",\r\n          "
				+ "    \"coverageEffectiveDate\": \"11/01/2018\",\r\n              \"coverageOptionCode\": \"01\",\r\n "
				+ "             \"premium\": null,\r\n              \"firstName\": \"ZIP3\",\r\n           "
				+ "   \"lastName\": \"KAYLA5\",\r\n              \"memberId\": \"355730423551\",\r\n           "
				+ "   \"supplierId\": \"\"\r\n            }\r\n          ],\r\n          \"coverageOptions\": [\r\n        "
				+ "    {\r\n              \"amount\": 35,\r\n              \"coverageOptionCode\": \"01\",\r\n         "
				+ "     \"numberOfEnrollees\": 5,\r\n              \"rate\": 7\r\n            }\r\n          ],\r\n     "
				+ "     \"fee\": {\r\n            \"adjustmentFee\": 0,\r\n            \"adminRate\": 7,\r\n           "
				+ " \"amount\": 3211.7,\r\n            \"claimsPaid\": 1576.85,\r\n            \"cobraTotal\": 0,\r\n          "
				+ "  \"enrolleeRoster\": 35,\r\n            \"enrollmentAdjustmentsAmount\": 0,\r\n          "
				+ "  \"invoiceCapitation\": 0,\r\n            \"invoiceMiscellaneous\": 0,\r\n           "
				+ " \"invoiceOther\": 0,\r\n            \"invoicePrefund\": 0,\r\n            \"invoicePrefundDeposit\": 0,\r\n "
				+ "           \"numberOfClaims\": 0,\r\n            \"otherAdminFee\": 56,\r\n           "
				+ " \"perEnrolleeTotal\": 35,\r\n            \"settlementAdjustmentsAmount\": 0,\r\n           "
				+ " \"stopLossFee\": 0,\r\n            \"totalAmount\": 3211.7\r\n          }\r\n        },\r\n     "
				+ "   {\r\n          \"divisionNumber\": \"00002\",\r\n          \"numberOfEnrollees\": 3,\r\n       "
				+ "   \"memberDetails\": [\r\n            {\r\n              \"amount\": 7,\r\n             "
				+ " \"assignedId\": \"\",\r\n              \"coverageEffectiveDate\": \"11/01/2018\",\r\n            "
				+ "  \"coverageOptionCode\": \"01\",\r\n              \"premium\": null,\r\n             "
				+ " \"firstName\": \"ZIP1\",\r\n              \"lastName\": \"COLLEGE\",\r\n            "
				+ "  \"memberId\": \"302532067201\",\r\n              \"supplierId\": \"\"\r\n            },\r\n       "
				+ "     {\r\n              \"amount\": 7,\r\n              \"assignedId\": \"\",\r\n           "
				+ "  \"coverageEffectiveDate\": \"11/01/2018\",\r\n              \"coverageOptionCode\": \"01\",\r\n         "
				+ "     \"premium\": null,\r\n              \"firstName\": \"ZIP2\",\r\n           "
				+ "   \"lastName\": \"COLLEGE\",\r\n              \"memberId\": \"327033139901\",\r\n            "
				+ "  \"supplierId\": \"\"\r\n            },\r\n            {\r\n              \"amount\": 7,\r\n        "
				+ "      \"assignedId\": \"\",\r\n              \"coverageEffectiveDate\": \"11/01/2018\",\r\n         "
				+ "     \"coverageOptionCode\": \"01\",\r\n              \"premium\": null,\r\n           "
				+ "   \"firstName\": \"ZIP3\",\r\n              \"lastName\": \"COLLEGE\",\r\n            "
				+ "  \"memberId\": \"443834398201\",\r\n              \"supplierId\": \"\"\r\n            }\r\n    "
				+ "      ],\r\n          \"coverageOptions\": [\r\n            {\r\n              \"amount\": 21,\r\n   "
				+ "           \"coverageOptionCode\": \"01\",\r\n              \"numberOfEnrollees\": 3,\r\n          "
				+ "    \"rate\": 7\r\n            }\r\n          ],\r\n          \"fee\": {\r\n          "
				+ "  \"adjustmentFee\": 0,\r\n            \"adminRate\": 7,\r\n            \"amount\": 3211.7,\r\n        "
				+ "    \"claimsPaid\": 1578.85,\r\n            \"cobraTotal\": 0,\r\n            \"enrolleeRoster\": 21,\r\n  "
				+ "          \"enrollmentAdjustmentsAmount\": 0,\r\n            \"invoiceCapitation\": 0,\r\n         "
				+ "   \"invoiceMiscellaneous\": 0,\r\n            \"invoiceOther\": 0,\r\n           "
				+ " \"invoicePrefund\": 0,\r\n            \"invoicePrefundDeposit\": 0,\r\n          "
				+ "  \"numberOfClaims\": 0,\r\n            \"otherAdminFee\": 56,\r\n           "
				+ " \"perEnrolleeTotal\": 21,\r\n            \"settlementAdjustmentsAmount\": 0,\r\n       "
				+ "     \"stopLossFee\": 0,\r\n            \"totalAmount\": 3211.7\r\n          }\r\n      "
				+ "  }\r\n      ]\r\n    }\r\n  ],\r\n  \"internalReferenceId\": \"BE003141000-2019-02-22-20:34:47\",\r\n "
				+ " \"invoiceCreationDate\": null,\r\n  \"invoiceGenerationDate\": \"01/09/2020\",\r\n"
				+ "  \"invoiceNumber\": \"BE003141000\",\r\n  \"status\": \"completed\",\r\n "
				+ " \"invoiceSubType\": \"ASC ZIP1\",\r\n  \"invoiceType\": null,\r\n "
				+ " \"lastReleaseDate\": null,\r\n  \"lastUpdatedDate\": null,\r\n"
				+ "  \"perMemberPerMonthBilling\": null,\r\n  \"publisherName\": \"DDC\",\r\n "
				+ " \"purchaseOrderNumber\": \"\",\r\n  \"statementTypeIdentifier\": \"DDC-ASC\",\r\n  "
				+ "\"underWritingState\": \"05\"\r\n}");
		
		return Arrays.asList(invoice);
	}
	
}
