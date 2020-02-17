/**
 * 
 */
package com.data.rest.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.data.rest.db.entity.InvoiceInfo;
import com.data.utils.InvoiceConstants;

/**
 * @author ArunJSR
 */
@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceInfo, Long> {
	
	@Query(value = InvoiceConstants.QUERY_INVOICE_DETAILS_BY_ID + "?1", nativeQuery = true)
	List getInvoiceDetailsBYID(String id);
	
	@Query(value = InvoiceConstants.QUERY_INVOICE_DETAILS_BY_INVOICE_NUMBER + "?1", nativeQuery = true)
	List getInvoiceDetailsBYInvoiceNumber(String invoiceNumber);
	
	@Query(value = InvoiceConstants.QUERY_INVOICE_DETAILS_BY_STATUS + "?1", nativeQuery = true)
	List getInvoiceDetailsBYStatus(String status);

	@Query(value = InvoiceConstants.QUERY_INVOICE_DETAILS_BY_INVOICE_GENERATION_DATE, nativeQuery = true)
	List getInvoiceDetailsBYInvoiceGenerationDate(String startDate, String endDate);
	
	@Query(value = InvoiceConstants.QUERY_INVOICE_DETAILS_BY_BILLING_ANALYST_CODE, nativeQuery = true)
	List getInvoiceDetailsByBillingAnalystCode(String code);
	
	@Query(value = InvoiceConstants.QUERY_INVOICE_DETAILS_BY_CUSTOMER_TYPE, nativeQuery = true)
	List getInvoiceDetailsByCustomerType(String type);
	
	@Query(value = InvoiceConstants.QUERY_INVOICE_DETAILS_BY_GROUP_NUMBER, nativeQuery = true)
	List getInvoiceDetailsByGroupNumber(String groupNumber);
	
	@Query(value = InvoiceConstants.QUERY_GROUP_DETAILS_BY_AMOUNT_RANGE, nativeQuery = true)
	List getGroupDetailsByAmountRange(double startRange, double endRange);
	
	@Query(value = InvoiceConstants.QUERY_MEMBER_DETAILS_BY_FIRST_NAME, nativeQuery = true)
	List getMemberDetailsByFirstName(String firstName);
	
	@Query(value = InvoiceConstants.QUERY_MEMBER_DETAILS_BY_LAST_NAME, nativeQuery = true)
	List getMemberDetailsByLastName(String lastName);
	
	@Query(value = InvoiceConstants.QUERY_MEMBER_DETAILS_BY_MEMBER_ID, nativeQuery = true)
	List getMemberDetailsByMemberId(String memberId);

}
